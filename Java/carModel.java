import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int model;
        
        // Loop to continuously ask for the car model until the user enters -1
        do {
            System.out.print("Enter the model of your car: ");
            model = input.nextInt(); // Read an integer value from the user
        
            // Check if the input is not -1 (which is the exit condition)
            if (model != -1){
                // Check if the entered model number falls within the defective range
                if (model == 14 || model == 54 || model >= 135 && model <= 142 || model >= 202 && model <= 215 || model == 318){
                    System.out.println("the model is defective"); // Model is defective
                } else {
                    System.out.println("the model is fine"); // Model is not defective
                }
            }
        } while(model != -1); // Exit the loop when the user enters -1
    }
}