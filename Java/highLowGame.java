import java.util.Scanner;  // Import the Scanner class for user input
import java.util.Random;   // Import the Random class for generating random numbers

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input
        Random rnd = new Random();  // Create a Random object for generating bot's number
        char again = 'y';  // Variable to control if the user wants to play again
        int money = 1000;  // Initialize player's starting money
        
        System.out.println("You currently have $" + money);
        
        // Main game loop, runs as long as the user inputs 'y' and has money
        while (again == 'y' && money > 0) {
            
            // Generate a random number between 1 and 13 for the bot
            int bot = rnd.nextInt(13) + 1;
            
            // Prompt the player to choose High (1) or Low (2)
            System.out.print("Choose High(1) or Low(2): ");
            int player = input.nextInt();
            
            // Prompt the player to enter their wager amount
            System.out.print("Enter wager amount: ");
            int wager = input.nextInt();
            
            // Check the game's rules and adjust money based on the outcome
            if (bot == 7) {
                // If the bot's number is 7, the player loses automatically
                System.out.println("You lose");
                money -= wager;
            } else if (bot > 7 && player == 1) {
                // If the bot's number is greater than 7 and the player chose High, the player wins
                System.out.println("You Win");
                money += wager;
            } else if (bot < 7 && player == 2) {
                // If the bot's number is less than 7 and the player chose Low, the player wins
                System.out.println("You Win");
                money += wager;
            } else {
                // In all other cases, the player loses
                System.out.println("You lose");
                money -= wager;
            }
            
            // If the player still has money, ask if they want to play again
            if (money > 0) {
                System.out.println("You currently have $" + money);
                System.out.println("Do you want to play again? [y/n]");
                again = input.next().charAt(0);  // Read the first character of the player's response
            } else {
                // Exit the loop if the player runs out of money
                break;
            }
        }
        
        // End of game messages
        if (money <= 0) {
            // Inform the player if they are bankrupt
            System.out.println("You are bankrupt and have no money left");
        } else {
            // Inform the player of their final cash out
            System.out.println("You cashed out and now have $" + money);
        }
    }
}
