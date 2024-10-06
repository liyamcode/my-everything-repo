import random

def generate_numbers():
    """Generate two random numbers between 1 and 100."""
    num1 = random.randint(1, 100)
    num2 = random.randint(1, 100)
    return num1, num2

def main():
    print("Welcome to the Addition Game!")
    while True:
        num1, num2 = generate_numbers()
        correct_answer = num1 + num2
        user_answer = input(f"What is the sum of {num1} and {num2}? (Type 'quit' to exit): ")
        
        if user_answer.lower() == 'quit':
            print("Thanks for playing! Goodbye.")
            break
        
        try:
            user_answer = int(user_answer)
            if user_answer == correct_answer:
                print("Correct! Well done.")
            else:
                print(f"Sorry, the correct answer is {correct_answer}. Better luck next time!")
        except ValueError:
            print("Invalid input. Please enter a number or 'quit' to exit.")

if __name__ == "__main__":
    main()