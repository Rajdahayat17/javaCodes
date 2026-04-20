package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        for (int i=1;i<=row;i++){
            for (int j=1; j<=col; j++){
                if (i==1 || i==row || j==1 || j==col) {
                    System.out.print( "* "); // odd row → numbers
                } else {
                    System.out.print("  "); // even row → A B C
                }
            }
            System.out.println();
    }
}
}

//| Row (i) | Boundary Condition Check                | j runs till | Output count |
//| ------- | --------------------------------------- | ----------- | ------------ |
//| 1       | i==1  → true (top boundary)             | 1 → 6       | 6 stars      |
//| 2       | j==1 & j==6 → edges only                | 1 → 6       | 2 stars      |
//| 3       | j==1 & j==6 → edges only                | 1 → 6       | 2 stars      |
//| 4       | j==1 & j==6 → edges only                | 1 → 6       | 2 stars      |
//| 5       | i==row → true (bottom boundary)         | 1 → 6       | 6 stars      |