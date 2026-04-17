package Pattern_Printing;

import java.util.Scanner;

public class StarRectangleABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) { // kitni line hogi
            for (int j = 1; j <= col; j++) { // har line me kitne honge
                System.out.print((char) (i + 64) + " "); // print AAAA
            }
            System.out.println();         // moved inside
        }
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (j + 64) + " "); // print AB
            }
            System.out.println();
        }
        System.out.println();



        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (i + 96) + " "); // print aa
            }
            System.out.println();         // moved inside
        }
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (j + 96) + " "); // print ab
            }
            System.out.println();
        }
    }
}
