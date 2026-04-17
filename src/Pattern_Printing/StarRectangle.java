package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {   // fixed
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");   // fixed
            }
            System.out.println();         // moved inside
        }
    }
}