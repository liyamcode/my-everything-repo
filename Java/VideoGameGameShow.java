import java.util.Scanner;

public class VideoGameShowdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("🎮🎉 WELCOME TO VIDEO GAME SHOWDOWN! 🎉🎮");
        System.out.println("Test your gaming knowledge and try to get a perfect score!\n");

        // Question 1
        System.out.println("1. In which game do you battle the Ender Dragon?");
        System.out.println("A) Terraria");
        System.out.println("B) Minecraft");
        System.out.println("C) Skyrim");
        System.out.println("D) Fortnite");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine().trim().toUpperCase();

        if (answer1.equals("B")) {
            System.out.println("✅ Correct! Minecraft it is.\n");
            score += 10;
        } else {
            System.out.println("❌ Nope! It's B) Minecraft.\n");
        }

        // Question 2
        System.out.println("2. Who is the main character in The Legend of Zelda series?");
        System.out.println("A) Zelda");
        System.out.println("B) Ganondorf");
        System.out.println("C) Link");
        System.out.println("D) Samus");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine().trim().toUpperCase();

        if (answer2.equals("C")) {
            System.out.println("✅ Correct! It's Link.\n");
            score += 10;
        } else {
            System.out.println("❌ Oof! The answer is C) Link.\n");
        }

        // Question 3
        System.out.println("3. What color is the original Pac-Man?");
        System.out.println("A) Red");
        System.out.println("B) Blue");
        System.out.println("C) Yellow");
        System.out.println("D) Green");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine().trim().toUpperCase();

        if (answer3.equals("C")) {
            System.out.println("✅ Yup! Pac-Man is yellow.\n");
            score += 10;
        } else {
            System.out.println("❌ Wrong! It's C) Yellow.\n");
        }

        // Question 4
        System.out.println("4. In which game do players drop from a Battle Bus?");
        System.out.println("A) PUBG");
        System.out.println("B) Fortnite");
        System.out.println("C) Apex Legends");
        System.out.println("D) Warzone");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine().trim().toUpperCase();

        if (answer4.equals("B")) {
            System.out.println("✅ That's right! The Battle Bus is from Fortnite.\n");
            score += 10;
        } else {
            System.out.println("❌ Nope! It's B) Fortnite.\n");
        }

        // Question 5
        System.out.println("5. What company makes the PlayStation?");
        System.out.println("A) Microsoft");
        System.out.println("B) Sony");
        System.out.println("C) Nintendo");
        System.out.println("D) Sega");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine().trim().toUpperCase();

        if (answer5.equals("B")) {
            System.out.println("✅ Correct! Sony makes the PlayStation.\n");
            score += 10;
        } else {
            System.out.println("❌ Incorrect! It's B) Sony.\n");
        }

        // Final Score
        System.out.println("🎮 GAME OVER! Your total score: " + score + " out of 50.");

        if (score == 50) {
            System.out.println("🏆 You’re a true gaming legend!");
        } else if (score >= 40) {
            System.out.println("🔥 Great job, gamer!");
        } else if (score >= 30) {
            System.out.println("👍 Not bad, keep grinding!");
        } else {
            System.out.println("👀 Better brush up on your game knowledge!");
        }

        scanner.close();
    }
}
