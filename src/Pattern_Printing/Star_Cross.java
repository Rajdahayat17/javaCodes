package Pattern_Printing;

import java.util.Scanner;

public class Star_Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Input should be odd for a perfectly centered cross
        // Example: 5x5, 7x7, 9x9

        // Outer loop controls rows
        for (int i = 1; i <= row; i++) {

            // Inner loop controls columns
            for (int j = 1; j <= col; j++) {

                // Print '*' if:
                // 1. Current row is the middle row
                // OR
                // 2. Current column is the middle column
                //
                // (row + 1) / 2 gives the middle row number
                // (col + 1) / 2 gives the middle column number
                if (i == (row + 1) / 2 || j == (col + 1) / 2) {
                    System.out.print("* ");
                } else {

                    // Print spaces at all other positions
                    System.out.print("  ");
                }
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}

//| Row (i) | Condition Check                                      | j runs till | Output count |
//| ------- | ---------------------------------------------------- | ----------- | ------------ |
//| 1       | j==1 OR j==5 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 2       | j==2 OR j==4 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 3       | j==3 → (i==j AND i+j==6, center point)               | 1 → 5       | 1 star       |
//| 4       | j==2 OR j==4 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 5       | j==1 OR j==5 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |