package Pattern_Printing;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        // input odd hi dena hai ni to output sahi ni ayega

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

//| Row (i) | Condition Check                                      | j runs till | Output count |
//| ------- | ---------------------------------------------------- | ----------- | ------------ |
//| 1       | j==1 OR j==5 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 2       | j==2 OR j==4 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 3       | j==3 → (i==j AND i+j==6, center point)               | 1 → 5       | 1 star       |
//| 4       | j==2 OR j==4 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |
//| 5       | j==1 OR j==5 → (i==j, i+j==6)                        | 1 → 5       | 2 stars      |