import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int strength, health, luck;
        String name;
        
        //asks user for name and amount of Strength, Health, and Luck
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Strength, from (1-10): ");
        strength = input.nextInt();
        System.out.print("Health, from (1-10): ");
        health = input.nextInt();
        System.out.print("Luck, from (1-10): ");
        luck = input.nextInt();
        
        //if total stats are more than 15
        if (strength + health + luck > 15){
            //tells them stats are to high and sets them to default of 5 of each
            System.out.println("Stats set too high. All stats reset to default value of 5.");
            strength = 5;
            health = 5;
            luck = 5;
            //prints out name and sets stats to default of 5 for each and prints them out
            System.out.println("hello " + name);
            System.out.println("your strength is now: " + strength);
            System.out.println("your health is now: " + health);
            System.out.println("your luck is now: " + luck);
        //if total stats are more than 15
        } else {
            //prints out name and their stats
            System.out.println("hello " + name);
            System.out.println("your strength is now: " + strength);
            System.out.println("your health is now: " + health);
            System.out.println("your luck is now: " + luck);
        }
    }
}