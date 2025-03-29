import java.util.Random;
import java.util.Scanner;

public class LuckChanceSpinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the chance of winning (e.g., 0.001 for 0.001%): ");
        double winChance = scanner.nextDouble();

        System.out.print("Enter number of spins: ");
        int spins = scanner.nextInt();

        boolean won = false;
        for (int i = 1; i <= spins; i++) {
            double roll = random.nextDouble(); // Generates a random number between 0.0 and 1.0
            if (roll < winChance / 100) {
                System.out.println("🎉 You won on spin " + i + "!");
                won = true;
                break;
            }
        }

        if (!won) {
            System.out.println("😢 You didn't win after " + spins + " spins.");
        }

        scanner.close();
    }
}