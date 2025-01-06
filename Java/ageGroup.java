import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int age;
        
        //asks user for their age
        System.out.print("your age: ");
        age = input.nextInt();
        
        //checks what age group they fall under and tells the user
        System.out.print("you are a ");
        if (age >= 18){
            System.out.print("Adult");
        } else if ((age >= 13) && (age <= 17)){
            System.out.print("Teen");
        } else if ((age >= 11) && (age <= 12)){
            System.out.print("Preteen");
        } else if ((age >= 6) && (age <= 10)){
            System.out.print("Child");
        } else if ((age >= 0) && (age <= 5)){
            System.out.print("Toddler");
        }
    }
}