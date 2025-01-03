import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        //asks user for 3 unique numbers
        System.out.print("First unique number: ");
        num1 = input.nextInt();
        System.out.print("Second unique number: ");
        num2 = input.nextInt();
        System.out.print("Third unique number: ");
        num3 = input.nextInt();
        
        
        //orders each number they inputed from gratest to least
        System.out.print("Numbers from gratest to least are: ");
        if ((num1 > num2) && (num2 > num3)){
            System.out.print(num1 + " " + num2 + " " + num3);
        } else if ((num1 > num3) && (num3 > num2)){
            System.out.print(num1 + " " + num3 + " " + num2);
        } else if ((num2 > num1) && (num1 > num3)){
            System.out.print(num2 + " " + num1 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)){
            System.out.print(num2 + " " + num3 + " " + num1);
        } else if ((num3 > num1) && (num1 > num2)){
            System.out.print(num3 + " " + num1 + " " + num2);
        } else if ((num3 > num2) && (num2 > num1)){
            System.out.print(num3 + " " + num2 + " " + num1);
        } else {
            //if the user didn't put 3 unique numbers the program will tell the user that they didn't put 3 unique numbers
            System.out.print("You didn't put 3 unique numbers");
        }
    }
}