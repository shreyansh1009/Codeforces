package codeforces;

import java.util.Scanner;

public class roundno {
    static int round(int n){
        int count = 0;
        if (n>10) {
            for (int j = 0; j < n; j++) {
                if (n % 10 != 0) {
                    int k = n % 10;
                    count++;
                    n = n / 10;
                    n = n * 10;
                    System.out.println(n + " " + k);
                    System.out.println(count);

                } else {
                    break;
                }
            }
        }else {
            System.out.println(n);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0;i<t;i++){
            int n = scanner.nextInt();
            round(n);
        }
}}

