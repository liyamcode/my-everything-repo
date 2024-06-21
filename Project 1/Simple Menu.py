# Menu items and their respective costs
item1 = "Pizza"
cost1 = 10
item2 = "Burger"
cost2 = 5
item3 = "Drink"
cost3 = 2
# Display the menu
print("Menu:")
print("1. {} - ${}".format(item1, cost1))
print("2. {} - ${}".format(item2, cost2))
print("3. {} - ${}".format(item3, cost3))
# Ask user to enter the amount of each item they wish to purchase
quantity1 = int(input("Enter the quantity of {} you wish to purchase: ".format(item1)))
quantity2 = int(input("Enter the quantity of {} you wish to purchase: ".format(item2)))
quantity3 = int(input("Enter the quantity of {} you wish to purchase: ".format(item3)))
# Calculate subtotal
subtotal = (cost1 * quantity1) + (cost2 * quantity2) + (cost3 * quantity3)
# Calculate total including 13% tax
tax_rate = 0.13
total = subtotal + (subtotal * tax_rate)
# Display subtotal and total
print("Subtotal: ${:.2f}".format(subtotal))
print("Total (including 13% tax): ${:.2f}".format(total))