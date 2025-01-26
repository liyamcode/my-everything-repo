import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        int total = 1;
       
        //asks user to enter a number
        System.out.print("Enter a number: ");
        num = input.nextInt();
       
        //loops for the number the user had input
        for (int i = 1; i <= num; i++) {
            //multiply all the numbers from 1 to the number the user entered
            total = total * i;
        }
        //prints out the final total
        System.out.println("The total product from 1 to " + num + " is " + total);
    }
}