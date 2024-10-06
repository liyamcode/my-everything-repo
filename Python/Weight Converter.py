def pounds_to_kg(pounds):
    kilograms = pounds * 0.453592
    return kilograms

def kg_to_pounds(kilograms):
    pounds = kilograms / 0.453592
    return pounds

def main():
    print("1. Pounds to Kilograms")
    print("2. Kilograms to Pounds")
    choice = int(input("Enter your choice (1 or 2): "))
    
    if choice == 1:
        pounds = float(input("Enter weight in pounds: "))
        kilograms = pounds_to_kg(pounds)
        print(f"{pounds} pounds is equal to {kilograms:.2f} kilograms.")
    elif choice == 2:
        kilograms = float(input("Enter weight in kilograms: "))
        pounds = kg_to_pounds(kilograms)
        print(f"{kilograms} kilograms is equal to {pounds:.2f} pounds.")
    else:
        print("Invalid choice. Please enter 1 or 2.")

if __name__ == "__main__":
    main()
