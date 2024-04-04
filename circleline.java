package codeforces;
import java.util.Scanner;

public class circleline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            distances[i] = scanner.nextInt();
        }
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        // Calculate and print the result
        int result = shortestDistance(n, distances, s, t);
        System.out.println(result);
    }

    static int shortestDistance(int n, int[] distances, int s, int t) {
        int totalDistance = 0;
        for (int distance : distances) {
            totalDistance += distance;
        }

        int clockwiseDistance = 0;
        for (int i = Math.min(s, t) - 1; i < Math.max(s, t) - 1; i++) {
            clockwiseDistance += distances[i];
        }
        int counterclockwiseDistance = totalDistance - clockwiseDistance;

        return Math.min(clockwiseDistance, counterclockwiseDistance);
    }
}
