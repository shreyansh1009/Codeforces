package codeforces;
import java.util.Scanner;

    public class SystemAdministrator {
        // Function to determine if a server is "alive" or "dead"
        static String serverStatus(int packetsReceived, int totalPackets) {
            return (packetsReceived >= totalPackets / 2) ? "LIVE" : "DEAD";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input reading
            int n = scanner.nextInt();
            int packetsA = 0;
            int totalA = 0;
            int packetsB = 0;
            int totalB = 0;

            for (int i = 0; i < n; i++) {
                int t = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (t == 1) {
                    packetsA += x;
                    totalA += 10;
                } else {
                    packetsB += x;
                    totalB += 10;
                }
            }

            // Output
            System.out.println(serverStatus(packetsA, totalA));
            System.out.println(serverStatus(packetsB, totalB));
        }
    }


