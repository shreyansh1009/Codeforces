package codeforces;

import java.util.Scanner;

public class candieandtwosister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            if(n <= 2){
                System.out.println(0);
            }else {
                System.out.println((n-1)/2);
            }
        }
    }
}
