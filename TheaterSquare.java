package codeforces;

import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextInt();
        long n = scanner.nextInt();
        long a = scanner.nextInt();
        long row= (n+a-1)/a;
        long column = (m+a-1)/a;
        long total = row *column;
        System.out.println(total);
    }
}
