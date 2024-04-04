package codeforces;
import java.util.Scanner;

public class RoundNumber {
    static void round(int n) {
        if (n > 10) {
            String numberStr = Integer.toString(n);
            int length = numberStr.length();

            System.out.println((length - 1) + " ");
            for (int i = 0; i < length - 1; i++) {
                int digit = Character.getNumericValue(numberStr.charAt(i));
                int roundedPart = digit * (int) Math.pow(10, length - i - 1);
                System.out.print(roundedPart + " ");
            }

            System.out.println(Character.getNumericValue(numberStr.charAt(length - 1)));
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            round(n);
        }
    }
}



