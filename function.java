package codeforces;
import java.util.Scanner;
public class function {
    private static Object forEach;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result =0L;
        if(n%2==0){
            result = n/2;
            System.out.println(result);
        }
        else {
            result = -((n+1)/2);
            System.out.println(result);
        }
    }
}
