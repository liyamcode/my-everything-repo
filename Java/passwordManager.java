import java.util.Scanner;
import java.util.ArrayList;

class Main {

    private static ArrayList<String> accounts = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Password Manager");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Delete Account");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addAccount(scanner);
                    break;
                case 2:
                    viewAccounts();
                    break;
                case 3:
                    deleteAccount(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void addAccount(Scanner scanner) {
        System.out.print("Enter account name: ");
        String account = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        accounts.add(account);
        passwords.add(password);

        System.out.println("Account added successfully!");
    }

    private static void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts stored.");
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". Account: " + accounts.get(i) + " | Password: " + passwords.get(i));
            }
        }
    }

    private static void deleteAccount(Scanner scanner) {
        viewAccounts();
        if (accounts.isEmpty()) return;

        System.out.print("Enter the account number to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= accounts.size()) {
            accounts.remove(index - 1);
            passwords.remove(index - 1);
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Invalid account number.");
        }
    }
}
