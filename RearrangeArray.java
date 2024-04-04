package codeforces;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Rearrange the array
        for (int i = 1; i < n; i += 2) {
            if (i - 1 >= 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;


            }
            if (i + 1 < n && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }


        // Output the rearranged array

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
        }




