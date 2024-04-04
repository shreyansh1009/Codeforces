package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] length = new int[4];
        for (int i=0;i< length.length;i++){
            length[i]= scanner.nextInt();
        }
        Arrays.sort(length);
        if (length[0] + length[1] > length[2]||length[1]+length[2]>length[3]) {
            System.out.println("TRIANGLE");
        } else if (length[0] + length[1]==length[2]||length[1]+length[2]==length[3]) {
            System.out.println("SEGMENT");
        }
        else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
