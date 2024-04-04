package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[4];
        for (int i =0;i<4;i++){
            x[i]= scanner.nextInt();
        }
        Arrays.sort(x);
        int a =x[3]-x[1];
        int b =x[3]-x[2];
        int c =x[3]-x[0];
        System.out.println(a+" "+b+" "+c);
    }
}
