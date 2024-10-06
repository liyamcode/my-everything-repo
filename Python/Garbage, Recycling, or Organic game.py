import random

# List of 30 items
items = [
    "apple core", "banana peel", "plastic bottle", "cardboard box", "newspaper",
    "egg shell", "aluminum can", "glass bottle", "bread crust", "styrofoam cup",
    "coffee grounds", "tea bag", "paper towel", "plastic bag", "metal can",
    "chicken bone", "potato peel", "tin foil", "pizza box", "yogurt container",
    "cereal box", "plastic fork", "egg carton", "orange peel", "tissue paper",
    "milk carton", "plastic wrap", "cheese wrapper", "corn cob", "coffee cup"
]

# Correct categories for each item
categories = {
    "apple core": "organic", "banana peel": "organic", "plastic bottle": "recycling",
    "cardboard box": "recycling", "newspaper": "recycling", "egg shell": "organic",
    "aluminum can": "recycling", "glass bottle": "recycling", "bread crust": "organic",
    "styrofoam cup": "garbage", "coffee grounds": "organic", "tea bag": "organic",
    "paper towel": "organic", "plastic bag": "garbage", "metal can": "recycling",
    "chicken bone": "organic", "potato peel": "organic", "tin foil": "recycling",
    "pizza box": "recycling", "yogurt container": "recycling", "cereal box": "recycling",
    "plastic fork": "garbage", "egg carton": "recycling", "orange peel": "organic",
    "tissue paper": "organic", "milk carton": "recycling", "plastic wrap": "garbage",
    "cheese wrapper": "garbage", "corn cob": "organic", "coffee cup": "garbage"
}

# Function to run the game
def run_game():
    print("Welcome to the Waste Sorting Game!")
    print("Type 'garbage', 'recycling', or 'organic' for each item.")
    print("Let's start!\n")

    # Select 10 random items
    random_items = random.sample(items, 10)
    score = 0

    for item in random_items:
        print(f"Where does '{item}' go?")
        answer = input("Your choice: ").lower()
        if answer == categories[item]:
            print("Correct!\n")
            score += 1
        else:
            print(f"Wrong! The correct answer is '{categories[item]}'.\n")

    print(f"Game over! Your score is: {score}/10")

# Run the game
run_game()