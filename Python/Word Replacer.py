# Ask the user to input a phrase
phrase = input("Enter a phrase: ")
# Ask the user to input 2 letters
letter1 = input("Enter the first letter: ")
letter2 = input("Enter the second letter: ")
# Replace all occurrences of the 1st letter with the 2nd letter in the phrase
new_phrase = phrase.replace(letter1, letter2)
# Output the new phrase with the letters replaced
print("Phrase with letters replaced:", new_phrase)
# Output the length of the string
print("Length of the string:", len(new_phrase))