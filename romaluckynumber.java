package codeforces;
import java.util.Scanner;
public class romaluckynumber {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int k,n,digit;
         n = scanner.nextInt();
        k = scanner.nextInt();
        int count=0;

         for (int i = 0;i<n;i++){
             int number = scanner.nextInt();
             if(countLuckyDigits(number)<=k){
                 count++;
             }
         }
        System.out.println(count);
         scanner.close();
    }
    private static int countLuckyDigits(int number){
        int count =0;
        while(number>0){
            int digit = number%10;
            if(digit==4||digit==7){
                count++;
            }
            number/=10;
        }
        return count;
    }
}
