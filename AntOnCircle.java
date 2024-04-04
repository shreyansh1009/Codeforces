package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AntOnCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of marks on the circle
        int m = scanner.nextInt(); // Number of ants
        int t = scanner.nextInt(); // Time in seconds

        int[] positions = new int[m];
        for (int i = 0; i < m; i++) {
            int antPosition = scanner.nextInt();
            int antDirection = scanner.nextInt();
            int newPosition = (antPosition + antDirection * t) % n;
            if (newPosition <= 0) {
                newPosition += n; // Wrap around to the beginning
            }
            positions[i] = newPosition;
        }

        Arrays.sort(positions);
        for (int pos : positions) {
            System.out.print(pos + " ");
        }
    }
}

