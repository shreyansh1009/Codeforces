package codeforces;
import java.util.*;

public class codeforces245A {
    static String server(int packetRecived,int totalPacket){
        return(packetRecived >= totalPacket/2)?"LIVE":"DEAD";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commands = sc.nextInt();
        int totalA = 0;
        int packetA = 0;
        int totalB= 0;
        int packetB = 0;
        for(int i=0;i<commands;i++) {
            int sn = sc.nextInt();
            int ps = sc.nextInt();
            int pl = sc.nextInt();
            if (sn == 1) {
                packetA+= ps;
                totalA+=10;

            } else {
                packetB+= ps;
                totalB+= 10;
            }
        }
        System.out.println(server(packetA,totalA));
        System.out.println(server(packetB,totalB));
    }
}


