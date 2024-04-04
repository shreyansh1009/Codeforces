package codeforces;
import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int steps=x/5;
        int steps1=x%5;
        if(steps1>=1){
            steps = steps+1;
            System.out.println(steps);
        }
        else {
            System.out.println(steps);
        }



        }
    }
