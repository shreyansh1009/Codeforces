import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Mainold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the frequencies
        int N = scanner.nextInt();
        int[] frequencies = new int[N];
        for (int i = 0; i < N; i++) {
            frequencies[i] = scanner.nextInt();
        }

        // Input the key sizes
        int K = scanner.nextInt();
        int[] keySizes = new int[K];
        for (int i = 0; i < K; i++) {
            keySizes[i] = scanner.nextInt();
        }

        int result = assignKeys(frequencies, keySizes);
        System.out.println(result);
    }

    public static int assignKeys(int[] frequencies, int[] keySizes) {
        // Sort both frequencies and keySizes in descending order
        Arrays.sort(frequencies);
        Arrays.sort(keySizes);

        // Check if there's enough room on the keys for all letters
        if (Arrays.stream(keySizes).sum() < frequencies.length) {
            return -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int keySize : keySizes) {
            pq.offer(keySize);
        }

        int totalKeystrokes = 0;
        for (int i = frequencies.length - 1; i >= 0; i--) {
            int maxKeySize = pq.poll();
            totalKeystrokes += frequencies[i] * maxKeySize;
            maxKeySize--;
            if (maxKeySize > 0) {
                pq.offer(maxKeySize);
            }
        }

        return totalKeystrokes;
    }
}
