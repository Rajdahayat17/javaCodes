package Pattern_Printing;

import java.util.Scanner;

public class BridgePrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ---------------- TOP LINE ----------------
        // Print (2*n - 1) stars in the first row.
        // Example: n = 4
        // Total stars = 2*4 - 1 = 7
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Number of spaces between left and right stars
        // Starts with 1 and increases by 2 after each row
        int nsp = 1;

        // ---------------- REMAINING ROWS ----------------
        // Rows start from 2 because the first row is already printed
        for (int i = 2; i <= n; i++) {

            // Print left-side stars
            // Number of stars decreases by 1 in every row
            // Formula: (n + 1 - i)
            //
            // Example (n = 4):
            // Row 2 → 3 stars
            // Row 3 → 2 stars
            // Row 4 → 1 star
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Print middle spaces
            // Spaces increase by 2 in every row
            //
            // Example:
            // Row 2 → 1 space
            // Row 3 → 3 spaces
            // Row 4 → 5 spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print right-side stars
            // Same number of stars as left side
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Increase spaces for the next row
            nsp += 2;

            // Move to the next line
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