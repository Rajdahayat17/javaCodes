package Pattern_Printing;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ⭐ Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

//| Row (i) | Spaces (n-i) | Stars (n) | j runs till (spaces) | j runs till (stars) | Output count |
//| ------- | ------------ | --------- | -------------------- | ------------------- | ------------ |
//| 1       | 5-1 = 4      | 5         | 1 → 4                | 1 → 5               | 4 spaces + 5 stars |
//| 2       | 5-2 = 3      | 5         | 1 → 3                | 1 → 5               | 3 spaces + 5 stars |
//| 3       | 5-3 = 2      | 5         | 1 → 2                | 1 → 5               | 2 spaces + 5 stars |
//| 4       | 5-4 = 1      | 5         | 1 → 1                | 1 → 5               | 1 space + 5 stars |
//| 5       | 5-5 = 0      | 5         | —                    | 1 → 5               | 0 space + 5 stars |

