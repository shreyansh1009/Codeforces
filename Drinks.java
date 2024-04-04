package codeforces;
import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] volumes = new int[n];
        for(int i=0;i<n;i++){
            volumes[i] = scanner.nextInt();
        }
        double result = calculateOrangeJuiceFraction(n,volumes);
        System.out.println(result);
    }
    static double calculateOrangeJuiceFraction(int n,int[] volumes){
        double totalVolume = 0;
        double totalWeightedVolume = 0;

        // Calculate total volume and total weighted volume
        for (int i = 0; i < n; i++) {
            totalVolume += volumes[i];
            totalWeightedVolume += volumes[i] / 100.0;
        }

        // Calculate and return the result
        return (totalWeightedVolume / n) * 100.0;
    }
    }

