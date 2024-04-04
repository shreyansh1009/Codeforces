package codeforces;
import java.util.Scanner;
public class yettwointegers {
    static int main(int a,int b){
        int diff = Math.abs(a-b);
        int moves = (diff+9)/10;
        return moves;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(main(a,b));
        }
    }
}

