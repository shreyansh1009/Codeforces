package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class hoildayofequality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int j = 0;j<n;j++){
            int m = arr[n-1]-arr[j];
            sum = m+sum;
        }
        System.out.println(sum);
}}
