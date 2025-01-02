import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        String number;
        
        //Asks user to enter a three digit number
        System.out.print("Enter a three digit number: ");
        number = input.nextLine();
        
        //Prints the hundreds digit
        System.out.println("Hundreds digit is: " + number.charAt(0));
        
        //Prints the tens digit
        System.out.println("Tens digit is: " + number.charAt(1));
        
        //Prints the ones digit
        System.out.println("Ones digit is: " + number.charAt(2));
    }
}