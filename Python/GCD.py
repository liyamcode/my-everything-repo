# Program to find the GCD of two numbers
# Function to calculate GCD
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
# Input from user
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
# Output GCD
print("The GCD of", num1, "and", num2, "is:", gcd(num1, num2))