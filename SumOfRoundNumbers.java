package codeforces;

import java.util.Scanner;

    public class SumOfRoundNumbers {
        static void sumOfRoundNumbers(int n) {
            int count = 0;
            int multiplier = 1; // Used to calculate the round numbers

            StringBuilder result = new StringBuilder();

            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    int roundNumber = digit * multiplier;
                    result.insert(0, roundNumber + " ");
                    count++;
                }

                n /= 10;
                multiplier *= 10;
            }

            System.out.println(count);
            System.out.println(result.toString().trim());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                sumOfRoundNumbers(n);
            }
        }
    }

