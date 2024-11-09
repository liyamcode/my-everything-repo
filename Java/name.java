import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        int age;

        //asks user questions and gets answer from the user
        //first name
        System.out.print("What is your first name: ");
        firstName = input.nextLine();
        //last name
        System.out.print("What is your last name: ");
        lastName = input.nextLine();
        //age
        System.out.print(firstName + " what is your age: ");
        age = input.nextInt();

        //tells user their initals
        System.out.println("Your initals are: " + firstName.charAt(0) + lastName.charAt(0));
        
        //tells user their age
        System.out.println("Your age is: " + age);
        
        //tells user the number of characters in their full name
        System.out.println("Number of characters in your full name are: " + (firstName.length() + lastName.length()));
    }
}