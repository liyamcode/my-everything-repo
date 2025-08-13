import turtle
import random
import math

# Screen setup
screen = turtle.Screen()
screen.bgcolor("white")
screen.title("Random Map Generator")
screen.setup(width=1.0, height=1.0)  # Fullscreen

pen = turtle.Turtle()
pen.hideturtle()
pen.speed(0)
pen.color("black")
pen.pensize(3)

# Disable animation for instant draw
turtle.tracer(0, 0)

# Get screen size
width = screen.window_width()
height = screen.window_height()

# Obstacle drawing functions
def segment_flat(x, y, seg_width):
    pen.penup()
    pen.goto(x, y)
    pen.pendown()
    pen.goto(x + seg_width, y)
    return x + seg_width, y

def segment_ramp(x, y, seg_width):
    new_y = y + random.randint(-height // 6, height // 6)
    pen.penup()
    pen.goto(x, y)
    pen.pendown()
    pen.goto(x + seg_width, new_y)
    return x + seg_width, new_y

def segment_hill(x, y, seg_width):
    radius = seg_width // 2
    center_x = x + radius
    center_y = y
    pen.penup()
    pen.goto(x, y)
    for angle in range(181):
        px = center_x - radius * math.cos(math.radians(angle))
        py = center_y + radius * math.sin(math.radians(angle))
        if angle == 0:
            pen.penup()
            pen.goto(px, py)
            pen.pendown()
        else:
            pen.goto(px, py)
    return x + seg_width, y

def segment_boxes(x, y, seg_width):
    box_size = min(50, seg_width // 3)
    count = seg_width // (box_size + 5)
    px = x
    for _ in range(count):
        pen.penup()
        pen.goto(px, y)
        pen.pendown()
        for _ in range(4):
            pen.forward(box_size)
            pen.left(90)
        pen.right(90)
        px += box_size + 5
        pen.left(90)
    return x + seg_width, y

def segment_staircase(x, y, seg_width):
    steps = 4
    step_width = seg_width // steps
    step_height = random.randint(15, 40)
    px, py = x, y
    pen.penup()
    pen.goto(px, py)
    for _ in range(steps):
        pen.pendown()
        pen.forward(step_width)
        pen.left(90)
        pen.forward(step_height)
        pen.right(90)
        px += step_width
        py += step_height
    return x + seg_width, py

# Map generator
segment_types = [segment_flat, segment_ramp, segment_hill, segment_boxes, segment_staircase]

x = -width // 2
y = 0
while x < width // 2:
    seg_width = random.randint(100, 250)
    segment_func = random.choice(segment_types)
    x, y = segment_func(x, y, seg_width)

# Show instantly
turtle.update()
turtle.done()
