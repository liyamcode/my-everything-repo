# Ask the user to enter a phrase
phrase = input("Enter a phrase: ")
# Check if all vowels are present in the phrase
if all(char in phrase.lower() for char in ['a', 'e', 'i', 'o', 'u']):
    print("All vowels (a, e, i, o, u) are present in the phrase.")
else:
    print("Not all vowels (a, e, i, o, u) were found in the phrase.")