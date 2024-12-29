import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word1, word2;
        
        //Asks user for their first word
        System.out.print("What is your first word: ");
        word1 = input.nextLine();
        //Asks user for their second word
        System.out.print("What is your second word: ");
        word2 = input.nextLine();
        
        //will check if both words are equal
        if (word1.equalsIgnoreCase(word2)){
            //if words are equal it will print true
            System.out.print("True");
        } else {
            //if words are not equal it will print false
            System.out.print("False");
        }
    }
}