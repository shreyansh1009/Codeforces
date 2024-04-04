package codeforces;

import java.util.Scanner;

public class WizardWand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int query = scanner.nextInt();
        int[] arr = new int[size];
        int[] querries = new int[query];
        for (int index = 0; index <size; index++) {
            arr[index] = scanner.nextInt();
        }
        for (int index = 0; index <query; index++) {
            querries[index] = scanner.nextInt();
        }
        for (int index = 0; index <query; index++) {
            int k = 0;
            int cost = 0;
            for (int index1  = 0; index1  <size; index1 ++) {
                k = arr[index1]-querries[index];
                k = Math.abs(k);
                cost += k;

            }
            System.out.print(cost+" ");

        }

    }
}
