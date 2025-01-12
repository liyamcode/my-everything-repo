import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int guess;
        
        // asks user to guess a number from 1-20
        System.out.print("guess a number from 1-20: ");
        guess = input.nextInt();
            
        // for loop which will make this loop 2 times
        for(int i = 0; i < 2; i++){
            // if the users guess isn't 7 it then makes the user try again
            if (guess != 7){
                System.out.print("try again: ");
                guess = input.nextInt();
            }
        }
        // if guess isn't 7 after the 3 trys it will tell the user that they ran out of trys
        if(guess != 7){
            System.out.print("ran out of trys");
        //if the user did guess 7 it will tell them they got it correct
        } else if (guess == 7){
            System.out.print("correct");
        }
    }
}