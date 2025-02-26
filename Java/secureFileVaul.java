import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;
import java.util.Scanner;
class Main {
    private static final String ALGORITHM = "AES";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'encrypt' or 'decrypt':");
        String mode = scanner.nextLine().trim().toLowerCase();
        
        System.out.println("Enter file path:");
        String filePath = scanner.nextLine();
        
        System.out.println("Enter secret key (16 characters long):");
        String key = scanner.nextLine();
        if (key.length() != 16) {
            System.out.println("Key must be exactly 16 characters!");
            return;
        }
        
        if (mode.equals("encrypt")) {
            encryptFile(filePath, key);
        } else if (mode.equals("decrypt")) {
            decryptFile(filePath, key);
        } else {
            System.out.println("Invalid mode!");
        }
    }
    
    private static void encryptFile(String filePath, String key) throws Exception {
        String content = readFile(filePath);
        String encryptedData = encrypt(content, key);
        writeFile(filePath + ".enc", encryptedData);
        System.out.println("File encrypted successfully!");
    }
    
    private static void decryptFile(String filePath, String key) throws Exception {
        String content = readFile(filePath);
        String decryptedData = decrypt(content, key);
        writeFile(filePath.replace(".enc", "_decrypted.txt"), decryptedData);
        System.out.println("File decrypted successfully!");
    }
    
    private static String encrypt(String data, String key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    
    private static String decrypt(String encryptedData, String key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
    
    private static String readFile(String filePath) throws IOException {
        return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(filePath)));
    }
    
    private static void writeFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
}
