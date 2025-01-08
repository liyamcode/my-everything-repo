import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;
        
        // asks user for sides 1, 2, and 3
        // then stores all the information
        System.out.print("Side 1 is: ");
        side1 = input.nextInt();
        System.out.print("Side 2 is: ");
        side2 = input.nextInt();
        System.out.print("Side 3 is: ");
        side3 = input.nextInt();
        
        // checks if all sides are equal
        if (side1 == side2 && side2 == side3 && side3 == side1){
            // if true prints out that it is a Equilateral triangle
            System.out.print("Your triangle is an Equilateral triangle");
        // checks if all sides are not equal
        } else if (side1 != side2 && side2 != side3 && side3 != side1){
            // if true prints out that it is a Scalene triangle
            System.out.print("Your triangle is an Scalene triangle");
        // by defalt if the top two are not true it would mean 2 sides are equal
        } else {
            // if the first two are false then prints Isosceles triangle
            System.out.print("Your triangle is an Isosceles triangle");
        }
    }
}