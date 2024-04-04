package codeforces;

import java.util.Scanner;

public class VasyatheHipster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>=b){
            a = a-b;
            a =a/2;
            System.out.println(b+" "+a);
        }
        else{
            b=b-a;
            b = b/2;
            System.out.println(a+" "+b);
        }
    }
}
