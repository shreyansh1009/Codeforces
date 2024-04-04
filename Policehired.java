package codeforces;

import java.util.Scanner;

public class Policehired {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) count += a[i];
            if (a[i] == -1) {
                if (count < 1) {
                    flag++;
                } else {
                    count--;
                }
            }
        }
        System.out.println(flag);
    }
}
