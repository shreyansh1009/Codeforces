package codeforces;

import java.util.Scanner;

public class EpicGame {
    static int gcd(int a, int b) {
        for (int i = b; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }


        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(), n = s.nextInt(), stones = s.nextInt();
        int aa = 2;
        while (stones >= 0) {

            if (aa % 2 == 0) {
                int bb = gcd(m, stones);

                if (stones <= 0) {
                    System.out.println("1");
                    stones = -1;

                }
                stones = stones - bb;
                aa++;
            } else {
                int bb = gcd(n, stones);

                if (stones <= 0) {
                    System.out.println("0");
                    stones = -1;
                }
                stones = stones - bb;

                aa++;
            }

        }


    }
}