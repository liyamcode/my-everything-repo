import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        String word1, word2;

        // Prompt user for the first word
        System.out.print("Enter your first word: ");
        word1 = input.nextLine();

        // Prompt user for the second word
        System.out.print("Enter your second word: ");
        word2 = input.nextLine();

        // Compare the two words (case-insensitive) and print the result
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("True"); // Words are equal
        } else {
            System.out.println("False"); // Words are not equal
        }

        // Close the Scanner to release resources
        input.close();
    }
}