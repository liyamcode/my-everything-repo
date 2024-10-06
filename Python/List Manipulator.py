# Ask the user for 5 integer inputs and store each input in a list
num_list = []
for i in range(5):
    num = int(input("Enter an integer: "))
    num_list.append(num)

# Ask the user for the 6th input
sixth_num = int(input("Enter the 6th integer: "))

# Check if the 6th item is in the list
if sixth_num in num_list:
    print("You are repeating a value.")
else:
    num_list.append(sixth_num)

# Calculate the average of all the numbers in the list
average = sum(num_list) / len(num_list)

# Find the largest value in the list
largest = max(num_list)

# Print the list in reverse order
num_list.reverse()

print("List of numbers:", num_list)
print("Average of the numbers:", average)
print("Largest number in the list:", largest)