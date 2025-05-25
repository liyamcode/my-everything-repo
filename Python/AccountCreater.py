import os

# File to store user data
FILE_NAME = "users.txt"

# Load users into a dictionary
def load_users():
    users = {}
    if os.path.exists(FILE_NAME):
        with open(FILE_NAME, 'r') as file:
            for line in file:
                if ':' in line:
                    username, password = line.strip().split(':', 1)
                    users[username] = password
    return users

# Save a new user
def save_user(username, password):
    with open(FILE_NAME, 'a') as file:
        file.write(f"{username}:{password}\n")

# Create a new account
def create_account(users):
    username = input("Choose a username: ")
    if username in users:
        print("Username already exists. Try another one.")
        return
    password = input("Choose a password: ")
    save_user(username, password)
    print("Account created successfully!")

# Sign in
def sign_in(users):
    username = input("Enter username: ")
    password = input("Enter password: ")
    if username in users and users[username] == password:
        print(f"Welcome back, {username}!")
    else:
        print("Invalid username or password.")

# Main menu
def main():
    while True:
        users = load_users()
        print("\n--- Simple Login System ---")
        print("1. Create Account")
        print("2. Sign In")
        print("3. Exit")
        choice = input("Select an option (1-3): ")
        if choice == '1':
            create_account(users)
        elif choice == '2':
            sign_in(users)
        elif choice == '3':
            print("Goodbye!")
            break
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
