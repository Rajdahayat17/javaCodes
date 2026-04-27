package Pattern_Printing;

import java.util.Scanner;

public class BridgePrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = 1;

        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            nsp += 2;

            System.out.println();
        }
    }
}