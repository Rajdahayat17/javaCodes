package Pattern_Printing;

import java.util.Scanner;

public class TriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ⭐ Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // 111 Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // 123 Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // AAA Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((char) (i + 64) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // ABC Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((char) (j + 64) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // aaa Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((char) (i + 96) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // abc Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((char) (j + 96) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i + j) > n) {
                    if (i % 2 != 0) {
                        System.out.print(j + " ");              // odd row → numbers
                    } else {
                        System.out.print((char) (j + 64) + " "); // even row → A B C
                    }
                } else {
                    System.out.print("  "); // spacing fix
                }

            }
            System.out.println(); // line break important

        }
    }
}
//| Row (i) | Valid j (where i+j>5) | j runs till | Output count | Space count |
//| ------- | --------------------- | ----------- | ------------ | ----------- |
//| 1       | j = 5                 | 1 → 5       | 1 element    | 4 spaces    |
//| 2       | j = 4,5               | 1 → 5       | 2 elements   | 3 spaces    |
//| 3       | j = 3,4,5             | 1 → 5       | 3 elements   | 2 spaces    |
//| 4       | j = 2,3,4,5           | 1 → 5       | 4 elements   | 1 space     |
//| 5       | j = 1,2,3,4,5         | 1 → 5       | 5 elements   | 0 space     |

//                        *
//                      * *
//                    * * *
//                  * * * *
//                * * * * *