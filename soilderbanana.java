package codeforces;
import java.util.Scanner;

public class soilderbanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costk = scanner.nextInt();
        int moneyn = scanner.nextInt();
        int bananaw = scanner.nextInt();
        int n=0;
        for (int i = 1; i <= bananaw; i++) {
            int hero = i*costk;
             n = n+hero;
        }
        int borrow = n - moneyn;
        
        if (borrow <= 0) {
            System.out.println(0);

        }
        else {
            System.out.println(borrow);
        }

    }
}
