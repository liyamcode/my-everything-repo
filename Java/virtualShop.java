import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Define items and prices
        double price1 = 0.50, price2 = 0.30, price3 = 0.20, price4 = 5.00, price5 = 3.00;
        int quantity1, quantity2, quantity3, quantity4, quantity5;
        
        // Prompt for quantity of each item
        System.out.printf("Enter quantity for Apple ($%.2f): ", price1);
        quantity1 = scanner.nextInt();
        
        System.out.printf("Enter quantity for Banana ($%.2f): ", price2);
        quantity2 = scanner.nextInt();
        
        System.out.printf("Enter quantity for Carrot ($%.2f): ", price3);
        quantity3 = scanner.nextInt();
        
        System.out.printf("Enter quantity for Detergent ($%.2f): ", price4);
        quantity4 = scanner.nextInt();
        
        System.out.printf("Enter quantity for Eggs ($%.2f): ", price5);
        quantity5 = scanner.nextInt();
        
        // Calculate subtotal, tax, and total
        double subtotal = quantity1 * price1 + quantity2 * price2 + quantity3 * price3 + quantity4 * price4 + quantity5 * price5;
        double tax = subtotal * 0.13;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f%nTax (13%%): $%.2f%nTotal: $%.2f%n", subtotal, tax, total);
        
        // Get payment and handle insufficient amount
        double payment;
        do {
            System.out.print("Enter payment amount: ");
            payment = scanner.nextDouble();
            if (payment < total) {
                System.out.printf("Insufficient amount. Please pay an additional $%.2f%n", total - payment);
            }
        } while (payment < total);
        
        // Calculate change
        double change = payment - total;
        System.out.printf("Change: $%.2f%n", change);
        
        // Calculate and display the least amount of change
        double[] denominations = {20.0, 10.0, 5.0, 2.0, 1.0, 0.25, 0.10, 0.05, 0.01};
        String[] names = {"$20", "$10", "$5", "$2", "$1", "$0.25", "$0.10", "$0.05", "$0.01"};

        System.out.println("Change breakdown:");
        for (int i = 0; i < denominations.length; i++) {
            int count = (int) (change / denominations[i]);
            change -= count * denominations[i];
            if (count > 0) {
                System.out.printf("%d = %s%n", count, names[i]);
            }
        }
    }
}