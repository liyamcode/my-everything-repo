def calculate_average():
    num_classes = int(input("Enter the number of classes: "))
    
    total_grade = 0
    
    for i in range(1, num_classes + 1):
        class_name = input(f"Enter the name of class {i}: ")
        class_grade = float(input(f"Enter the average grade for {class_name}: "))
        
        total_grade += class_grade
    
    # Calculate overall average
    if num_classes != 0:
        average = total_grade / num_classes
        print(f"\nOverall Average Grade: {average:.2f}")
    else:
        print("Error: Number of classes cannot be zero.")

if __name__ == "__main__":
    calculate_average()