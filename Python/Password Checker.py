# Store the password in a variable
password = "password"
# Initialize the number of chances
chances = 3
# Loop to give the user 3 chances to guess the password
while chances > 0:
		# Ask the user to guess the password
		guess = input("Guess the password: ")
		# Check if the guess is correct
		if guess == password:
				print("Congratulations! You guessed the password correctly.")
				break
		else:
				chances -= 1
				if chances > 0:
						print("Wrong password. You have", chances, "chances left.\n")
				else:
						print("Wrong password. You've run out of chances. Program ending.")