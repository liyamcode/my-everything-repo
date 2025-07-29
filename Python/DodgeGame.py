import tkinter as tk
import random

WIDTH, HEIGHT = 600, 400
PLAYER_SIZE = 50
ENEMY_SIZE = 50
ENEMY_BASE_SPEED = 4
ENEMY_FREQUENCY = 30  # frames between enemy drops

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
        self.lives = 3
        self.frame_count = 0
        self.enemy_speed = ENEMY_BASE_SPEED
        self.game_over = False
        self.paused = False

        self.score_text = self.canvas.create_text(10, 10, anchor='nw', text="Score: 0", font=('Arial', 14), fill='black')
        self.lives_text = self.canvas.create_text(10, 30, anchor='nw', text="Lives: 3", font=('Arial', 14), fill='black')
        self.instruction_text = self.canvas.create_text(WIDTH - 10, 10, anchor='ne',
                                                        text="← → to move | P: pause | R: resume",
                                                        font=('Arial', 10), fill='gray')

        root.bind("<Left>", self.move_left)
        root.bind("<Right>", self.move_right)
        root.bind("<p>", self.pause_game)
        root.bind("<r>", self.resume_game)

        self.update_game()

    def move_left(self, event):
        if not self.paused and self.player_x > 0:
            self.player_x -= 20
            self.canvas.move(self.player, -20, 0)

    def move_right(self, event):
        if not self.paused and self.player_x < WIDTH - PLAYER_SIZE:
            self.player_x += 20
            self.canvas.move(self.player, 20, 0)

    def pause_game(self, event):
        self.paused = True

    def resume_game(self, event):
        if not self.game_over:
            self.paused = False
            self.update_game()

    def update_game(self):
        if self.game_over or self.paused:
            return

        self.frame_count += 1
        if self.frame_count % ENEMY_FREQUENCY == 0:
            x = random.randint(0, WIDTH - ENEMY_SIZE)
            enemy = self.canvas.create_rectangle(x, 0, x + ENEMY_SIZE, ENEMY_SIZE, fill='red')
            self.enemies.append(enemy)

        for enemy in self.enemies[:]:
            self.canvas.move(enemy, 0, self.enemy_speed)
            pos = self.canvas.coords(enemy)

            if pos[1] > HEIGHT:
                self.enemies.remove(enemy)
                self.canvas.delete(enemy)
                self.score += 1
                self.canvas.itemconfigure(self.score_text, text=f"Score: {self.score}")
                self.increase_difficulty()
            elif self.check_collision(pos):
                self.enemies.remove(enemy)
                self.canvas.delete(enemy)
                self.lives -= 1
                self.canvas.itemconfigure(self.lives_text, text=f"Lives: {self.lives}")
                if self.lives <= 0:
                    self.end_game()

        if not self.game_over:
            self.root.after(50, self.update_game)

    def check_collision(self, enemy_pos):
        px1 = self.player_x
        py1 = self.player_y
        px2 = px1 + PLAYER_SIZE
        py2 = py1 + PLAYER_SIZE

        ex1, ey1, ex2, ey2 = enemy_pos
        overlap_x = px1 < ex2 and px2 > ex1
        overlap_y = py1 < ey2 and py2 > ey1
        return overlap_x and overlap_y

    def increase_difficulty(self):
        if self.score % 10 == 0:
            self.enemy_speed += 1

    def end_game(self):
        self.game_over = True
        self.canvas.create_text(WIDTH // 2, HEIGHT // 2, text=f"Game Over!\nScore: {self.score}",
                                font=('Arial', 24), fill='red')

if __name__ == "__main__":
    root = tk.Tk()
    game = Game(root)
    root.mainloop()
