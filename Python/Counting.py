# Ask the user for 3 numbers
number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))
number3 = int(input("Enter the third number: "))
# Multiply all the numbers from 1st number to the 2nd number, counting up by the 3rd number
total = 1
for i in range(number1, number2, number3):
    total *= i
print("Output:", total)