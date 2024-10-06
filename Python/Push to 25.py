import random

# Initialize the game variables
total_score = 0
points = 0

# Function to display the instructions
def show_instructions():
    print("Welcome to the 'Reach 25' Game!")
    print("Instructions:")
    print("- Your goal is to get as close to 25 as possible without going over.")
    print("- Each time you roll, you'll get a random number between 1 and 5.")
    print("- If your total reaches exactly 25, you win a big jackpot!")
    print("- If you go over 25, you lose and the game resets.")
    print("- If you stop before reaching 25, you'll earn half of your total score in points.")
    print("- Good luck!\n")

# Function to simulate picking a number
def pick_number():
    global total_score
    picked_number = random.randint(1, 5)
    total_score += picked_number
    print(f"You rolled: {picked_number}")
    print(f"Total Score: {total_score}")
    
    # Check game conditions
    if total_score > 25:
        print("Oh no! You went over 25! The game resets.")
        reset_game()
    elif total_score == 25:
        print("Amazing! You hit 25 exactly and won the jackpot of 100 points!")
        return_to_menu(100)
    else:
        print("Keep going! You're getting closer to 25.")

# Function to stop the game and keep points
def stop_game():
    global total_score, points
    earned_points = total_score // 2  # Half the score in points
    points += earned_points
    print(f"You stopped at {total_score} and earned {earned_points} points (half your score).")
    reset_game()

# Function to reset the game after stopping or losing
def reset_game():
    global total_score
    total_score = 0
    print(f"Your total points so far: {points}")
    menu()

# Function to return to the menu and continue the game
def return_to_menu(jackpot=0):
    global points
    points += jackpot
    total_score = 0
    print(f"Your total points: {points}")
    menu()

# Main game menu
def menu():
    while True:
        print("\n--- Game Menu ---")
        print("1. Keep going! Roll the dice!")
        print("2. Stop and collect points")
        choice = input("What would you like to do? (1/2): ")
        
        if choice == "1":
            pick_number()
        elif choice == "2":
            stop_game()
        else:
            print("Invalid choice, please pick 1 or 2.")

# Start the game with instructions
show_instructions()
menu()
