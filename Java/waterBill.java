import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        double liters, bill;

        // Prompt the user for input
        System.out.println("Where do you live?");
        System.out.print("Home (H), commercial (C), or industrial (I): ");
        answer = input.nextLine();

        System.out.print("Litres used in the thousands: ");
        liters = input.nextDouble();

        // Convert liters in thousands to actual liters
        liters = 1000;

        if (answer.equalsIgnoreCase("H")) {
            // Home use formula
            bill = (liters * 0.005 + 5) * 1.13; // Apply tax
            System.out.printf("Your water bill is: $%.2f%n", bill);

        } else if (answer.equalsIgnoreCase("C")) {
            // Commercial use formula
            if (liters <= 4000) {
                bill = 100 * 1.13; // Flat rate with tax
            } else {
                bill = (100 + (liters - 4000) * 0.0025) * 1.13; // Extra charge beyond 4000 liters, with tax
            }
            System.out.printf("Your water bill is: $%.2f%n", bill);

        } else if (answer.equalsIgnoreCase("I")) {
            // Industrial use formula
            if (liters <= 4000) {
                bill = 100 * 1.13; // Tax included
            } else if (liters <= 10000) {
                bill = 200 * 1.13; // Tax included
            } else {
                bill = 300 * 1.13; // Tax included
            }
            System.out.printf("Your water bill is: $%.2f%n", bill);
            
        } else {
            // Invalid input handling
            System.out.println("Invalid input");
        }
    }
}