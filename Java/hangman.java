import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
    // Method to check if the last guessed character is in the answer and display the word's progress
    static boolean checkCorrect(ArrayList<Character> userGuesses, int length, String answer, char lastGuess) {
        boolean correctGuess = false;
        displayWordProgress(userGuesses, answer); // Display the current state of the word
        for (int i = 0; i < length; i++) {
            if (answer.charAt(i) == lastGuess) { // Check if the last guessed character is in the answer
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    // Method to display the current state of the word with guessed letters and underscores
    static void displayWordProgress(ArrayList<Character> userGuesses, String answer) {
        for (int i = 0; i < answer.length(); i++) {
            if (userGuesses.contains(answer.charAt(i))) { // If the letter is guessed, display it
                System.out.print(answer.charAt(i) + " ");
            } else { // Otherwise, display an underscore
                System.out.print("_ ");
            }
        }
        System.out.println(); // Move to the next line after displaying the word
    }

    // Method to check if the entire word has been guessed
    static boolean isWordGuessed(ArrayList<Character> userGuesses, String answer) {
        for (char c : answer.toCharArray()) {
            if (!userGuesses.contains(c)) { // If any letter is not guessed, return false
                return false;
            }
        }
        return true; // All letters have been guessed
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        // Initialize variables
        String answer;
        int lives = 6; // Number of lives the player has
        int wordpool = rnd.nextInt(10); // Randomly pick a word from the list

        // List of words for the game
        ArrayList<String> words = new ArrayList<String>();
        words.add("running");
        words.add("smart");
        words.add("school");
        words.add("basketball");
        words.add("mastermind");
        words.add("special");
        words.add("chess");
        words.add("room");
        words.add("exam");
        words.add("unpredictable");

        // Select the answer randomly from the word list
        answer = words.get(wordpool);
        int length = answer.length(); // Length of the answer

        // Start the game
        System.out.println("Welcome to Hangman!");
        System.out.println("The word has " + length + " letters.");
        displayWordProgress(new ArrayList<>(), answer); // Display the initial state of the word

        // Lists to track guessed letters
        ArrayList<Character> userGuesses = new ArrayList<Character>();
        ArrayList<Character> wrongGuesses = new ArrayList<Character>();

        // Game loop
        while (lives > 0) {
            System.out.print("Guess a letter or the entire word: ");
            String guess = input.next().toLowerCase(); // Read user input

            if (guess.length() > 1) { // If the user guesses the whole word
                if (guess.equals(answer)) { // Correct word guess
                    System.out.println("Congratulations! You guessed the word!");
                    break;
                } else { // Incorrect word guess
                    System.out.println("Sorry, that's not the correct word.");
                    lives--; // Decrease lives
                }
            } else { // If the user guesses a single letter
                char guessChar = guess.charAt(0);
                if (userGuesses.contains(guessChar)) { // Check if the letter has already been guessed
                    System.out.println("You've already guessed that letter. Try again.");
                    continue;
                }
                userGuesses.add(guessChar); // Add the guessed letter to the list
                boolean correctGuess = checkCorrect(userGuesses, length, answer, guessChar);

                if (!correctGuess) { // If the guess is incorrect
                    System.out.println("Incorrect guess!");
                    lives--; // Decrease lives
                    if (!wrongGuesses.contains(guessChar)) {
                        wrongGuesses.add(guessChar); // Add to wrong guesses
                    }
                    System.out.println("Wrong guesses: " + wrongGuesses);
                }
            }

            System.out.println("Lives remaining: " + lives);

            // Check if the entire word has been guessed
            if (isWordGuessed(userGuesses, answer)) {
                System.out.println("Congratulations! You guessed the word: " + answer);
                break;
            }
        }

        // Game over message
        if (lives == 0) {
            System.out.println("Game over! The word was: " + answer);
        }

        input.close(); // Close the scanner
    }
}