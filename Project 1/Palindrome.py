# Palindrome checker program
def is_palindrome(phrase):
    processed_phrase = "".join(phrase.lower().split())
    return processed_phrase == processed_phrase[::-1]
user_input = input("Enter a phrase: ")
if is_palindrome(user_input):
    print("The phrase is a palindrome.")
else:
    print("The phrase is not a palindrome.")