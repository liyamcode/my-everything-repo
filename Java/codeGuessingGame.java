import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        while (playAgain) {
            int[] secretCode = new int[5];
            for (int i = 0; i < 5; i++) {
                secretCode[i] = random.nextInt(10); // Generate random digits 0-9
            }
            
            int lives = 10; // Number of attempts
            boolean won = false;
            
            System.out.println("Welcome to the Code Guessing Game!");
            System.out.println("Try to guess the 5-digit code. You have " + lives + " lives.");
            
            while (lives > 0) {
                System.out.print("Enter your 5-digit guess: ");
                String guess = scanner.next();
                
                if (guess.length() != 5 || !guess.matches("\\d{5}")) {
                    System.out.println("Invalid input. Enter exactly 5 digits.");
                    continue;
                }
                
                int correctDigits = countCorrectDigits(guess, secretCode);
                
                if (correctDigits == 5) {
                    System.out.println("Congratulations! You guessed the correct code: " + guess);
                    won = true;
                    break;
                } else {
                    lives--;
                    System.out.println("You have " + correctDigits + " correct digits.");
                    System.out.println("Lives remaining: " + lives);
                }
            }
            
            if (!won) {
                System.out.print("Game over! The correct code was: ");
                for (int num : secretCode) {
                    System.out.print(num);
                }
                System.out.println();
            }
            
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().equalsIgnoreCase("y");
        }
        
        scanner.close();
    }
    
    private static int countCorrectDigits(String guess, int[] secretCode) {
        int count = 0;
        for (char c : guess.toCharArray()) {
            for (int num : secretCode) {
                if (Character.getNumericValue(c) == num) {
                    count++;
                    break; // Prevent counting duplicates multiple times
                }
            }
        }
        return count;
    }
}
