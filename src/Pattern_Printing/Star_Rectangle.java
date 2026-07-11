package Pattern_Printing;

import java.util.Scanner;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) { // kitni line hogi
            for (int j = 1; j <= col; j++) { // har line me kitne honge
                System.out.print("* ");
            }
            System.out.println();         // moved inside
        }
    }
}