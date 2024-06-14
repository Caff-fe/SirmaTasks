package Exam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encryptedMessage = scan.nextLine();
        int shift = Integer.parseInt(scan.nextLine());

        StringBuilder decrypted = new StringBuilder();

        for (char ch : encryptedMessage.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base;
                if (Character.isUpperCase(ch)) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                char decryptedChar = (char) ((ch - base - shift + 26) % 26 + base);
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(" ");
            }
        }

        System.out.println(decrypted);
        //I am not fully sure how this works
        //used a lot of google for this
    }
}
