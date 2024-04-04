package codeforces;

import java.util.Scanner;

public class softdrink {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = scanner.nextInt();
        k = scanner.nextInt();
        l = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        p = scanner.nextInt();
        nl = scanner.nextInt();
        np = scanner.nextInt();
        int a = k*l;
        int b = a/nl;
        int e = c*d;
        int f = p/np;
        int g= Math.min(b,e);
        int w=Math.min(e,f);
        w =Math.min(g,w);
        w = w/n;
        System.out.println(w);
    }
}
