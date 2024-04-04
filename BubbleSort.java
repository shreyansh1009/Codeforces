package codeforces;

import java.util.Scanner;

    class BubbleSort  {
        public static void main(String[] args){
            //BufferedReader
            Scanner scanner = new Scanner(System.in);
            int numberOfElements = scanner.nextInt();
            int[] numbers = new int[numberOfElements];
            for (int index = 0; index < numberOfElements; index++) {
                numbers[index] = scanner.nextInt();
            }
            BubbleSort bubbleSort = new BubbleSort();
            int count = bubbleSort.bubbleSort1(numbers);
            System.out.println(count);

        }
        int bubbleSort1(int[] numbers) {
            int count = 0;
            int n = numbers.length;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                count++;
                for (int index = 0; index < n - 1; index++) { // Corrected the loop condition
                    if (numbers[index] > numbers[index + 1]) {
                        int temp = numbers[index];
                        numbers[index] = numbers[index + 1];
                        numbers[index + 1] = temp;
                        swapped = true;
                    }
                }
            }
            return count;
        }
    }


