import java.util.Scanner;

public class EncryptDecrypt {

    // Encryption function
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int charNum = c - 'A' + 1;
                encryptedText.append(charNum);
            }
        }
        return encryptedText.toString();
    }

    // Decryption function
    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                char decryptedChar = (char) (c - '0' + 'A' - 1);
                decryptedText.append(decryptedChar);
            }
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter text to encrypt or decrypt: ");
        String text = sc.nextLine();

        System.out.print("Enter 'encrypt' or 'decrypt': ");
        String action = sc.nextLine();

        // Call encryption or decryption function
        String result;
        if (action.equalsIgnoreCase("encrypt")) {
            result = encrypt(text);
        } else if (action.equalsIgnoreCase("decrypt")) {
            result = decrypt(text);
        } else {
            result = "Invalid action. Please enter 'encrypt' or 'decrypt'.";
        }
        System.out.println(result);
    }
}
