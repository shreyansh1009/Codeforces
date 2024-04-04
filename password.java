package codeforces;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Correct");
        } else {
            System.out.println("Too weak");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check password length
        if (password.length() < 5) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }
}
