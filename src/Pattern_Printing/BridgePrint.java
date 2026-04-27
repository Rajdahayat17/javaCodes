package Pattern_Printing;

import java.util.Scanner;

public class BridgePrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Top Line
        for (int i = 1; i <= 2 * n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int nsp = 1;

        // Remaining Part
        for (int i = 2; i <= n; i++) {

            // Left Stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Middle Spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right Stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            nsp += 2;

            System.out.println();
        }
    }
}

//top line logic
//| Row | Loop Condition        | i runs till | Stars Printed | Output                 |
//| --- | --------------------- | ----------- | ------------- | ---------------------- |
//| 1   | i <= 2*n - 1         | 1 → 7       | 7             | * * * * * * *          |


//| Row (i) | Left Stars (n+1-i) | Middle Spaces (nsp) | Right Stars (n+1-i) | nsp after row |
//| ------- | ------------------ | ------------------- | ------------------- | ------------- |
//| 2       | 4+1-2 = 3          | 1                   | 3                   | 3             |
//| 3       | 4+1-3 = 2          | 3                   | 2                   | 5             |
//| 4       | 4+1-4 = 1          | 5                   | 1                   | 7             |