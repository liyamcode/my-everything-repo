import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private static final String FILE_NAME = "passwords.dat";
    private static final String KEY_FILE = "secret.key";
    private static SecretKey secretKey;
    private static Map<String, String> passwords = new HashMap<>();

    public static void main(String[] args) {
        loadKey();
        loadPasswords();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Save Password\n2. Retrieve Password\n3. Delete Password\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    savePassword(service, password);
                    break;
                case 2:
                    System.out.print("Enter service name: ");
                    service = scanner.nextLine();
                    System.out.println("Password: " + retrievePassword(service));
                    break;
                case 3:
                    System.out.print("Enter service name: ");
                    service = scanner.nextLine();
                    deletePassword(service);
                    break;
                case 4:
                    savePasswords();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void loadKey() {
        try {
            File keyFile = new File(KEY_FILE);
            if (!keyFile.exists()) {
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(256, new SecureRandom());
                secretKey = keyGen.generateKey();
                try (FileOutputStream fos = new FileOutputStream(KEY_FILE)) {
                    fos.write(secretKey.getEncoded());
                }
            } else {
                byte[] keyBytes = new byte[32];
                try (FileInputStream fis = new FileInputStream(KEY_FILE)) {
                    fis.read(keyBytes);
                }
                secretKey = new SecretKeySpec(keyBytes, "AES");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadPasswords() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("::", 2);
                if (parts.length == 2) {
                    passwords.put(parts[0], decrypt(parts[1]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void savePasswords() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, String> entry : passwords.entrySet()) {
                bw.write(entry.getKey() + "::" + encrypt(entry.getValue()) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void savePassword(String service, String password) {
        passwords.put(service, password);
        savePasswords();
    }

    private static String retrievePassword(String service) {
        return passwords.getOrDefault(service, "No password found");
    }

    private static void deletePassword(String service) {
        passwords.remove(service);
        savePasswords();
    }

    private static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    private static String decrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(data));
        return new String(decrypted);
    }
}