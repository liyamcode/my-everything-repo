import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size;
        double average = 0;
        int[] array;
        
        //asks user for the size of the array
        System.out.print("Enter the size of the array (more than 4): ");
        size = input.nextInt();
        
        //makes the array the same size as the users input
        array = new int[size];
        
        //asks user for number they want again and again till the size of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
        }
        
        //prints out every forth number
        System.out.println("Every forth number is: ");
        for (int i = 3; i < size; i = i+4) {
            System.out.println(array[i]);
        }
        
        //adds up all the numbers in the array
        for (int i = 0; i < size; i++) {
            average = average + array[i];
        }
        //all numbers in the array added up divided by the size of the array
        average = average / size;
        System.out.print("the average is ");
        System.out.print(average);
    }
}