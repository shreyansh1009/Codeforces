package codeforces;
import java.util.Scanner;

public class MaxContiguousSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        int size = scanner.nextInt();
            Result result = findMax(arr, size);
            System.out.println(result.maxSum);
            for (int i : result.subarray) {
                System.out.print(i + " ");
        }scanner.close();
    }static class Result {
        int maxSum;
        int[] subarray;
        Result(int maxSum, int[] subarray) {
            this.maxSum = maxSum;
            this.subarray = subarray;
        }
    }static Result findMax(int[] arr, int size) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0;
        int tempStart = 0;
        int end = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }int[] subarray = new int[end - start + 1];
        System.arraycopy(arr, start, subarray, 0, subarray.length);
        return new Result(maxSum, subarray);
    }
}


