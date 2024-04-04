package codeforces;

import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n%m==0){
            for(int i=0;i<m;i++){
              int  a = n/m;
                System.out.print(a);
                System.out.print(" ");
            }
        }
        else{
            for (int i=0;i<m;i++){
            int a =n/m;
            n++;
                System.out.print(a);
                System.out.print(" ");
        }
    }
}}
