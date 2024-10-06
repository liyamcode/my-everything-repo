# This is just to practice lists. Not for marks.

# The program creates a list of names. The programs asks for the user's name and greets them using a method. The user is asked to enter a number. The number is how long the list will be. The program uses a for loop to fill up the list with names entered by the user. The program will then output the entire list.

# Greet method. 
# Receives a name as as parameter and prints hello.
def greet(name):
	print("Hello", name, "!")

# Main body of code.
# Program starts here.
name = input("Enter your name: ")
greet(name)

listOfNames = []

lengthOfList = int(input("Enter the length of the list: "))

for i in range(lengthOfList):
	listOfNames = listOfNames + [input("Add name to list: ")]

print(listOfNames)