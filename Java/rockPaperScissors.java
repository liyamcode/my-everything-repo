import java.util.Scanner;  // Import the Scanner class for user input
import java.util.Random;   // Import the Random class for generating random numbers

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input
        Random rnd = new Random();  // Create a Random object for generating bot's choice
        char again = 'y';  // Variable to control if the user wants to play again
        
        // Main game loop, runs as long as the user inputs 'y'
        while (again == 'y') {
            
            // Generate bot's choice (1: Rock, 2: Paper, 3: Scissors)
            int bot = rnd.nextInt(3) + 1;
            
            // Prompt the player for their choice
            System.out.print("Choose Rock(1), Paper(2), Scissor(3): ");
            int player = input.nextInt();
            
            // Determine the game outcome
            if (bot == player) {
                // If bot and player choose the same, it's a tie
                System.out.println("Tie");
            } else if (bot == 2 && player == 1) {
                // Paper (bot) beats Rock (player)
                System.out.println("Bot Wins");
            } else if (bot == 3 && player == 2) {
                // Scissors (bot) beats Paper (player)
                System.out.println("Bot Wins");
            } else if (bot == 1 && player == 3) {
                // Rock (bot) beats Scissors (player)
                System.out.println("Bot Wins");
            } else {
                // Any other case means the player wins
                System.out.println("Player Wins");
            }
            
            // Ask if the player wants to play again
            System.out.println("Do you want to play again? [y/n]");
            again = input.next().charAt(0);  // Read the first character of the player's response
        }
    }   
}
