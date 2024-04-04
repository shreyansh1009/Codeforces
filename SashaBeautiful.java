package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SashaBeautiful {


     public static int Beauty(int n){
         Scanner scanner = new Scanner(System.in);
         int count = 0;
         int[] array = new int[n];
         for (int i=0;i<n;i++) {
             array[i] = scanner.nextInt();
         }
         Arrays.sort(array);
         for (int i =0;i< array.length-1;i++){
             count += array[i+1]-array[i];
         }
         System.out.println(count);
         return count;

     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
        for (int i = 0;i<t;i++){
            int n = scanner.nextInt();
            Beauty(n);
        }
    }
}
