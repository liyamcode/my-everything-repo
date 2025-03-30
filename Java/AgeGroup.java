import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int age;

        try {
            // Ask user for their age
            System.out.print("Your age: ");
            age = input.nextInt();

            // Check if the input is valid
            if (age < 0) {
                System.out.println("Invalid age. Age cannot be negative.");
            } else {
                // Determine the age group
                System.out.print("You are a ");
                if (age >= 18) {
                    System.out.print("Adult");
                } else if (age >= 13) {
                    System.out.print("Teen");
                } else if (age >= 11) {
                    System.out.print("Preteen");
                } else if (age >= 6) {
                    System.out.print("Child");
                } else {
                    System.out.print("Toddler");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } finally {
            // Close the scanner
            input.close();
        }
    }
}