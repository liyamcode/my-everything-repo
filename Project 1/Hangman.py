import random

def select_word():
    words = ["apple", "banana", "cherry", "orange", "grape", "mango", "kiwi", "pineapple", "watermelon", "strawberry", "blueberry", "raspberry", "blackberry", "peach", "pear", "plum",]
    return random.choice(words)

def display_word(word, guessed_letters):
    display = ""
    for letter in word:
        if letter in guessed_letters:
            display += letter + " "
        else:
            display += "_ "
    return display

def game():
    word = select_word()
    guessed_letters = []
    lives = 3

    print("Welcome to the Word Guessing Game!")

    while lives > 0:
        print("\nWord:", display_word(word, guessed_letters))
        guess = input("Guess a letter: ").lower()

        if guess in guessed_letters:
            print("You already guessed that letter. Try again.")
            continue

        guessed_letters.append(guess)

        if guess not in word:
            print("Incorrect guess!")
            lives -= 1
            print(f"Lives left: {lives}")
        else:
            print("Correct guess!")

        if all(letter in guessed_letters for letter in word):
            print("Congratulations! You guessed the word:", word)
            break

    if lives == 0:
        print("\nOut of lives! The word was:", word)

game()