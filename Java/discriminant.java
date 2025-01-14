import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a, b, c, num;
        
        //asks user for value of a, b, and c
        System.out.print("Enter the value for a: ");
        a = input.nextDouble();
        System.out.print("Enter the value for b: ");
        b = input.nextDouble();
        System.out.print("Enter the value for c: ");
        c = input.nextDouble();
        
        //calculates the discriminant
        num = (b * b -4 * a * c);
        
        //if number is less than 0
        if(num < 0){
            //prints out that it has 0 x-intercepts if it is true
            System.out.print("The parabola has 0 x-intercepts");
        //if number is equal to 0
        } else if (num == 0){
            //prints out that it has 1 x-intercepts if it is true
            System.out.print("The parabola has 1 x-intercepts");
        //if number is more than 0
        } else if (num > 0){
            //prints out that it has 2 x-intercepts if it is true
            System.out.print("The parabola has 2 x-intercepts");
        }
    }
}