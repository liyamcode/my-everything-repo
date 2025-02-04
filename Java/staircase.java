import java.util.Scanner;

class Main {
    // Method to add spaces for alignment
    public static String addSpaces(int totalSize,  int currentRow) {
        int spaces = totalSize - currentRow; // Calculate the number of spaces
        StringBuilder spaceBuilder = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            spaceBuilder.append(" ");
        }
        return spaceBuilder.toString();
    }

    // Method to draw stars for each row
    public static String drawLine(int currentRow) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < currentRow * 2 - 1; i++) {
            stars.append("*");
        }
        return stars.toString();
    }

    // Main method to interact with the user and display the triangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size:  ");
        int size = scanner.nextInt();  // Read the size of the triangle

        // Loop to draw the triangle row by row
        for (int row = 1; row <= size; row++) {
            String spaces = addSpaces(size,  row);  // Get spaces for alignment
            String stars = drawLine(row);  // Get stars for the current row
            System.out.println(spaces + stars);  // Print the row
        }
    }
}