import java.util.Scanner;

class GridEditor {
    private String[][] grid;
    private int width, height;

    public GridEditor(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new String[height][width];

        // Initialize the grid with empty values
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = "[ ]";
            }
        }
    }

    public void insertData(int x, int y, String data) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            grid[y][x] = "[" + data + "]";
        } else {
            System.out.println("Invalid coordinates!");
        }
    }

    public void displayGrid() {
        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grid width: ");
        int width = scanner.nextInt();
        System.out.print("Enter grid height: ");
        int height = scanner.nextInt();

        GridEditor gridEditor = new GridEditor(width, height);

        while (true) {
            gridEditor.displayGrid();
            System.out.println("Enter coordinates (x, y) and value (or type 'exit' to quit): ");

            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int x = Integer.parseInt(input);
            int y = scanner.nextInt();
            String value = scanner.next();

            gridEditor.insertData(x, y, value);
        }

        scanner.close();
    }
}
