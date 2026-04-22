package Pattern_Printing;

import java.util.Scanner;

public class RightAlignedInvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ⭐ Star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        // 111
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();

        // 123
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print(j + " ");
            System.out.println();
        }

        System.out.println();

        // AAA
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print((char)(i + 64) + " ");
            System.out.println();
        }

        System.out.println();

        // ABC
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print((char)(j + 64) + " ");
            System.out.println();
        }

        System.out.println();

        // aaa
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print((char)(i + 96) + " ");
            System.out.println();
        }

        System.out.println();

        // abc
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) System.out.print((char)(j + 96) + " ");
            System.out.println();
        }

        System.out.println();

        // mix pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print("  ");
            for (int j = 1; j <= n - i + 1; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char)(j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
//| Row (i) | Spaces (i-1) | Elements (n-i+1) | j runs (elements) | Output count |
//| ------- | ------------ | ---------------- | ----------------- | ------------ |
//| 1       | 0            | 5                | 1 → 5             | 5 elements   |
//| 2       | 1            | 4                | 1 → 4             | 4 elements   |
//| 3       | 2            | 3                | 1 → 3             | 3 elements   |
//| 4       | 3            | 2                | 1 → 2             | 2 elements   |
//| 5       | 4            | 1                | 1 → 1             | 1 element    |

// * * * * *
//   * * * *
//     * * *s
//       * *
//         *