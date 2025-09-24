import pygame
import random

# Init
pygame.init()
WIDTH, HEIGHT = 1000, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Infinite Platformer")
clock = pygame.time.Clock()
font = pygame.font.Font(None, 50)

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (200, 50, 50)
GREEN = (0, 200, 0)
DARK_GREEN = (0, 150, 0)
BROWN = (139, 69, 19)

# --- Start Screen ---
def draw_start_screen():
    screen.fill(BLACK)
    button_rect = pygame.Rect(WIDTH//2 - 100, HEIGHT//2 - 40, 200, 80)

    # Outline
    pygame.draw.rect(screen, DARK_GREEN, button_rect, border_radius=20)
    inner_rect = button_rect.inflate(-6, -6)
    pygame.draw.rect(screen, GREEN, inner_rect, border_radius=18)

    # Text
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
                    return  # start game
        clock.tick(60)

# --- Ground System ---
ground_segments = []
SEG_MIN_W, SEG_MAX_W = 100, 200
SEG_VAR_Y = 80

def generate_segment(x, y, direction=1):
    seg_width = random.randint(SEG_MIN_W, SEG_MAX_W) * direction
    new_x = x + seg_width
    new_y = y + random.randint(-SEG_VAR_Y, SEG_VAR_Y)
    new_y = max(100, min(new_y, HEIGHT - 100))
    if direction == 1:
        return (x, y), (new_x, new_y)
    else:
        return (new_x, new_y), (x, y)

def init_ground():
    global ground_segments
    ground_segments = []
    x, y = 0, HEIGHT // 2

    # left
    for _ in range(20):
        seg = generate_segment(x, y, -1)
        ground_segments.insert(0, seg)
        x, y = seg[0]

    # reset right
    x, y = 0, HEIGHT // 2
    for _ in range(20):
        seg = generate_segment(x, y, 1)
        ground_segments.append(seg)
        x, y = seg[1]

def extend_ground_left():
    x, y = ground_segments[0][0]
    seg = generate_segment(x, y, -1)
    ground_segments.insert(0, seg)

def extend_ground_right():
    x, y = ground_segments[-1][1]
    seg = generate_segment(x, y, 1)
    ground_segments.append(seg)

def draw_ground(camera_x):
    points = [(ground_segments[0][0][0] - camera_x, HEIGHT)]
    for seg in ground_segments:
        points.append((seg[0][0] - camera_x, seg[0][1]))
    points.append((ground_segments[-1][1][0] - camera_x, ground_segments[-1][1][1]))
    points.append((ground_segments[-1][1][0] - camera_x, HEIGHT))
    pygame.draw.polygon(screen, BROWN, points)

    for seg in ground_segments:
        pygame.draw.line(
            screen, GREEN,
            (seg[0][0] - camera_x, seg[0][1]),
            (seg[1][0] - camera_x, seg[1][1]),
            8
        )

def get_ground_y(x):
    for seg in ground_segments:
        (x1, y1), (x2, y2) = seg
        if x1 <= x <= x2:
            t = (x - x1) / (x2 - x1)
            return int(y1 + t * (y2 - y1))
    return HEIGHT

# --- Game Loop ---
def game_loop():
    global ground_segments
    init_ground()

    player = pygame.Rect(100, 100, 30, 40)
    vel_y = 0
    on_ground = False
    camera_x = 0

    running = True
    while running:
        screen.fill(WHITE)

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

        # Collision
        ground_y = get_ground_y(player.centerx)
        if player.bottom >= ground_y:
            player.bottom = ground_y
            vel_y = 0
            on_ground = True

        # Camera
        camera_x = player.centerx - WIDTH // 2

        # Preload ground
        preload_distance = WIDTH
        if player.centerx < ground_segments[0][0][0] + preload_distance:
            extend_ground_left()
        if player.centerx > ground_segments[-1][1][0] - preload_distance:
            extend_ground_right()

        # Draw world
        draw_ground(camera_x)
        pygame.draw.rect(screen, RED, (player.x - camera_x, player.y, player.width, player.height))

        pygame.display.flip()
        clock.tick(60)

    pygame.quit()

# --- Run ---
start_menu()
game_loop()
