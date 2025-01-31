import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size;
        
        //asks user for a number from 5-10 and stores the input in a variable called size
        System.out.print("Enter a number from 5-10 for the size of the array: ");
        size = input.nextInt();
        
        int[] array = new int[size]; //makes a array the same size as the user has input
        
        for(int i = 0; i < size; i++){
            //asks user for a number 1-100
            System.out.print("Enter a number from 1-100: ");
            //stores the number the user has input in the array
            array[i] = input.nextInt();
        }
        
        //prints out the array the user has made
        System.out.print("Your array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " "); 
        }
       
        Arrays.sort(array); //sorts the array
        
        //prints the the smallest number in the array
        System.out.println("");
        System.out.print("The smallest number in your array is :");
        System.out.print(array[0]);
    }
}