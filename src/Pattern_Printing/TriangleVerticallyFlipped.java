package Pattern_Printing;

import java.util.Scanner;

public class TriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { // kitni line hogi
            for (int j = 1; j <= n; j++) { // har line me kitne honge
                System.out.print("* ");
            }
            System.out.println();         // moved inside
        }
    }
}
