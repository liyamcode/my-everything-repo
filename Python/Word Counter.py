def count_words(text):
    # Split the text by spaces
    words = text.split()
    
    # Count the number of words
    word_count = len(words)
    
    return word_count

# Prompt the user to enter a set of words
user_input = input("Please enter a set of words: ")

# Count the words in the user's input
word_count = count_words(user_input)

print(f"The number of words in the given text is: {word_count}")