# Encrypt/Decrypt Program
# Replit AI
# 2022-01-01
# This program allows the user to encrypt or decrypt a message using a code number.
def encrypt_decrypt():
    choice = input("Would you like to encrypt or decrypt? (e/d): ")
    phrase = input("Enter the phrase: ")
    code = int(input("Enter the code number: "))
    result = ""
    if choice == 'e':
        for i in range(len(phrase)):
            result += chr(ord(phrase[i]) + code)
    elif choice == 'd':
        for i in range(len(phrase)):
            result += chr(ord(phrase[i]) - code)
    else:
        print("Invalid choice. Please enter 'e' to encrypt or 'd' to decrypt.")
        return
    print("Result:", result)
encrypt_decrypt()