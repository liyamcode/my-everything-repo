import java.util.Scanner;

class Compare { // Fixed class name to match the filename
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word1, word2;
        
        // Asks user for their first word
        System.out.print("What is your first word: ");
        word1 = input.nextLine();
        // Asks user for their second word
        System.out.print("What is your second word: ");
        word2 = input.nextLine();
        
        // Will check if both words are equal
        if (word1.equalsIgnoreCase(word2)) {
            // If words are equal it will print true
            System.out.print("True");
        } else {
            // If words are not equal it will print false
            System.out.print("False");
        }
        input.close(); // Added to close the Scanner
    }
}