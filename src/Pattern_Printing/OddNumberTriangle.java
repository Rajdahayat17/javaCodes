package Pattern_Printing;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a=1;
        //  extra variable le k use print karva diya bus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
    }
}

//| Row (i) | Calculation (2*j - 1)                 | j runs till | Output count |
//| ------- | ------------------------------------- | ----------- | ------------ |
//| 1       | j=1 → 2*1-1=1                         | 1 → 1       | 1 value      |
//| 2       | j=1→1, j=2→3                          | 1 → 2       | 2 values     |
//| 3       | j=1→1, j=2→3, j=3→5                   | 1 → 3       | 3 values     |
//| 4       | j=1→1, j=2→3, j=3→5, j=4→7            | 1 → 4       | 4 values     |