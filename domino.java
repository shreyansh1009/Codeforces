package codeforces;
import java.util.*;

public class domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int board = M*N;
        int domino = 2;
        int maxdomino= board/domino;
        System.out.println(maxdomino);
        }


    }

