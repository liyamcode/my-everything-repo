import tkinter as tk
import random

WIDTH, HEIGHT = 600, 400
PLAYER_SIZE = 50
ENEMY_SIZE = 50
ENEMY_SPEED = 5
ENEMY_FREQUENCY = 30  # frames between enemies

class Game:
    def __init__(self, root):
        self.root = root
        self.root.title("Dodge Game (Tkinter)")

        self.canvas = tk.Canvas(root, width=WIDTH, height=HEIGHT, bg='white')
        self.canvas.pack()

        self.player_x = WIDTH // 2
        self.player_y = HEIGHT - PLAYER_SIZE - 10
        self.player = self.canvas.create_rectangle(
            self.player_x, self.player_y,
            self.player_x + PLAYER_SIZE, self.player_y + PLAYER_SIZE,
            fill='blue'
        )

        self.enemies = []
        self.score = 0
        self.frame_count = 0
        self.game_over = False

        self.score_text = self.canvas.create_text(10, 10, anchor='nw', text="Score: 0", font=('Arial', 16), fill='black')

        root.bind("<Left>", self.move_left)
        root.bind("<Right>", self.move_right)

        self.update_game()

    def move_left(self, event):
        if self.player_x > 0:
            self.player_x -= 20
            self.canvas.move(self.player, -20, 0)

    def move_right(self, event):
        if self.player_x < WIDTH - PLAYER_SIZE:
            self.player_x += 20
            self.canvas.move(self.player, 20, 0)

    def update_game(self):
        if self.game_over:
            self.canvas.create_text(WIDTH // 2, HEIGHT // 2, text=f"Game Over! Score: {self.score}", font=('Arial', 24), fill='red')
            return

        self.frame_count += 1
        if self.frame_count % ENEMY_FREQUENCY == 0:
            # Create a new enemy block at random x position
            x = random.randint(0, WIDTH - ENEMY_SIZE)
            enemy = self.canvas.create_rectangle(x, 0, x + ENEMY_SIZE, ENEMY_SIZE, fill='red')
            self.enemies.append(enemy)

        # Move enemies down
        for enemy in self.enemies[:]:
            self.canvas.move(enemy, 0, ENEMY_SPEED)
            pos = self.canvas.coords(enemy)
            if pos[1] > HEIGHT:
                self.enemies.remove(enemy)
                self.canvas.delete(enemy)
                self.score += 1
                self.canvas.itemconfigure(self.score_text, text=f"Score: {self.score}")
            elif self.check_collision(pos):
                self.game_over = True

        self.root.after(50, self.update_game)

    def check_collision(self, enemy_pos):
        # player coords
        px1 = self.player_x
        py1 = self.player_y
        px2 = px1 + PLAYER_SIZE
        py2 = py1 + PLAYER_SIZE

        ex1, ey1, ex2, ey2 = enemy_pos

        # Check overlap
        overlap_x = px1 < ex2 and px2 > ex1
        overlap_y = py1 < ey2 and py2 > ey1
        return overlap_x and overlap_y

if __name__ == "__main__":
    root = tk.Tk()
    game = Game(root)
    root.mainloop()
