package codeforces;

import java.util.Scanner;

public class Divisibiltyproblem {
    static int mymethod(int a, int b) {
        if(a%b==0){
            System.out.println("0");
            return 0;
        }
        else {
            int count = b -(a%b);
            System.out.println(count);
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            mymethod(a,b);
        }
    }
}


