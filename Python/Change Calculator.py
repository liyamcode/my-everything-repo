# Ask the user to enter an amount of change
change = float(input("Enter the amount of change: "))
# Calculate the amount of coins needed to make the change in the least amount
toonies = int(change / 2)
change -= toonies * 2
loonies = int(change)
change -= loonies
quarters = int(change / 0.25)
change -= quarters * 0.25
dimes = int(change / 0.1)
change -= dimes * 0.1
nickels = int(change / 0.05)
change -= nickels * 0.05
pennies = round(change * 100)
# Display the coins needed
print("Toonies:", toonies)
print("Loonies:", loonies)
print("Quarters:", quarters)
print("Dimes:", dimes)
print("Nickels:", nickels)
print("Pennies:", pennies)