package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i ==  (row + 1) / 2 || j==  (col + 1) / 2 ) {
                    System.out.print("* "); // odd row → numbers
                } else {
                    System.out.print("  "); // even row → A B C
                }
            }
            System.out.println();
        }
    }
}

//| Row (i) | Condition Check                                 | j runs till | Output count |
//| ------- | ----------------------------------------------- | ----------- | ------------ |
//| 1       | j==3 → true (middle column)                     | 1 → 5       | 1 star       |
//| 2       | j==3 → true (middle column)                     | 1 → 5       | 1 star       |
//| 3       | i==3 → true (middle row, full line)             | 1 → 5       | 5 stars      |
//| 4       | j==3 → true (middle column)                     | 1 → 5       | 1 star       |
//| 5       | j==3 → true (middle column)                     | 1 → 5       | 1 star       |
