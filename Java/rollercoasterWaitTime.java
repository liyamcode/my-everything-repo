import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the number of carts on the rollercoaster: ");
        int numCarts = scanner.nextInt();
        
        System.out.print("Enter the number of people per cart: ");
        int peoplePerCart = scanner.nextInt();
        
        System.out.print("Enter your position in line (starting from 1): ");
        int userPosition = scanner.nextInt();
        
        // Calculate total capacity per ride
        int totalCapacity = numCarts * peoplePerCart;
        
        // Calculate how many cycles it will take for the user's turn
        int userTurn = (userPosition + totalCapacity - 1) / totalCapacity;
        
        System.out.println("You will get to ride in cycle number: " + userTurn);
        
        // Additional feature: Show estimated waiting time
        System.out.print("Enter the duration of one cycle in minutes: ");
        int cycleDuration = scanner.nextInt();
        int waitTime = (userTurn - 1) * cycleDuration;
        System.out.println("Estimated wait time: " + waitTime + " minutes");
        
        scanner.close();
    }
}
