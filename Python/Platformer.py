import pygame
import random
import math

# Init
pygame.init()
WIDTH, HEIGHT = 1000, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Random Platformer")

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (200, 50, 50)
GREEN = (0, 200, 0)
DARK_GREEN = (0, 150, 0)

clock = pygame.time.Clock()
font = pygame.font.SysFont("arial", 40)

# --- Start Screen ---
def draw_start_screen():
    screen.fill(BLACK)
    button_rect = pygame.Rect(WIDTH//2 - 100, HEIGHT//2 - 40, 200, 80)

    # Draw button with outline
    pygame.draw.rect(screen, DARK_GREEN, button_rect, border_radius=20)   # outline
    inner_rect = button_rect.inflate(-6, -6)  # shrink for inner fill
    pygame.draw.rect(screen, GREEN, inner_rect, border_radius=18)

    # Draw text
    text = font.render("START", True, WHITE)
    text_rect = text.get_rect(center=button_rect.center)
    screen.blit(text, text_rect)

    pygame.display.flip()
    return button_rect

def start_menu():
    button_rect = draw_start_screen()
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            if event.type == pygame.MOUSEBUTTONDOWN:
                if button_rect.collidepoint(event.pos):
                    return  # Start game
        clock.tick(60)

# --- Game Ground Generation ---
def generate_ground():
    ground = []
    x, y = 0, HEIGHT // 2
    while x < WIDTH:
        seg_width = random.randint(100, 200)
        new_y = y + random.randint(-80, 80)
        new_y = max(100, min(new_y, HEIGHT - 100))  # keep inside screen
        ground.append(((x, y), (x + seg_width, new_y)))
        x += seg_width
        y = new_y
    return ground

ground_segments = generate_ground()

def draw_ground():
    points = [(0, HEIGHT)]
    for seg in ground_segments:
        points.append(seg[0])
    points.append(ground_segments[-1][1])
    points.append((WIDTH, HEIGHT))
    pygame.draw.polygon(screen, BLACK, points)

# --- Player ---
player = pygame.Rect(100, 100, 30, 40)
vel_y = 0
on_ground = False

def get_ground_y(x):
    for seg in ground_segments:
        (x1, y1), (x2, y2) = seg
        if x1 <= x <= x2:
            t = (x - x1) / (x2 - x1)
            return int(y1 + t * (y2 - y1))
    return HEIGHT

# --- Main Game Loop ---
def game_loop():
    global vel_y, on_ground
    running = True
    while running:
        screen.fill(WHITE)
        draw_ground()

        # Events
        keys = pygame.key.get_pressed()
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

        # Movement
        if keys[pygame.K_LEFT] or keys[pygame.K_a]:
            player.x -= 5
        if keys[pygame.K_RIGHT] or keys[pygame.K_d]:
            player.x += 5
        if (keys[pygame.K_SPACE] or keys[pygame.K_UP] or keys[pygame.K_w]) and on_ground:
            vel_y = -15
            on_ground = False

        # Gravity
        vel_y += 1
        player.y += vel_y

        # Ground collision
        ground_y = get_ground_y(player.centerx)
        if player.bottom >= ground_y:
            player.bottom = ground_y
            vel_y = 0
            on_ground = True

        # Draw player
        pygame.draw.rect(screen, RED, player)

        pygame.display.flip()
        clock.tick(60)
    pygame.quit()

# --- Run the Game ---
start_menu()
game_loop()
