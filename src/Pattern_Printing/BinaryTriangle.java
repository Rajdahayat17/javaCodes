package Pattern_Printing;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a=1;
        //  extra variable le k use print karva diya bus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1");              // odd row → numbers
                } else {
                    System.out.print(" 0"); // even row → A B C
                }
            }
            System.out.println();
        }
    }
}

//| Row (i) | Condition Check (i+j even → 1, odd → 0)          | j runs till | Output count |
//| ------- | ------------------------------------------------ | ----------- | ------------ |
//| 1       | j=1 → (1+1=2 even) → 1                           | 1 → 1       | 1 one        |
//| 2       | j=1→3 odd→0, j=2→4 even→1                        | 1 → 2       | 1 one, 1 zero|
//| 3       | j=1→4 even→1, j=2→5 odd→0, j=3→6 even→1          | 1 → 3       | 2 ones, 1 zero|
//| 4       | j=1→5 odd→0, j=2→6 even→1, j=3→7 odd→0, j=4→8 even→1 | 1 → 4   | 2 ones, 2 zero|
//| 5       | j=1→6 even→1, j=2→7 odd→0, j=3→8 even→1, j=4→9 odd→0, j=5→10 even→1 | 1 → 5 | 3 ones, 2 zero|
