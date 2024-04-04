package codeforces;

import java.util.Scanner;

public class CountZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int count1 = 0;
        int total = 0;
        String string = scanner.next();

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='1'){
                count++;
            } else if (string.charAt(i)=='0') {
                count1++;
            }
        }

        if (count<count1) {
            total = count1-count;
        } else if (count>count1) {
            total=count-count1;

        }
        System.out.println(total);
    }
}
