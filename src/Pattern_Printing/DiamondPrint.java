package Pattern_Printing;

import java.util.Scanner;

public class DiamondPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // First Method
        int nsp = n - 1, nst = 1;

        // Upper Part
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp--;
            nst += 2;

            System.out.println();
        }

        nsp = 1;
        nst = nst - 4;

        // Lower Part
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp++;
            nst -= 2;

            System.out.println();
        }


// 📊 Upper Part Table (n = 5)
//| Row (i) | nsp before print | nst before print | Spaces | Stars | Update after row |
//| ------- | ---------------- | ---------------- | ------ | ----- | ---------------- |
//| 1       | 4                | 1                | 4      | 1     | nsp=3, nst=3     |
//| 2       | 3                | 3                | 3      | 3     | nsp=2, nst=5     |
//| 3       | 2                | 5                | 2      | 5     | nsp=1, nst=7     |
//| 4       | 1                | 7                | 1      | 7     | nsp=0, nst=9     |
//| 5       | 0                | 9                | 0      | 9     | nsp=-1, nst=11   |

//📊 Lower Part Table
//| Row (i) | nsp before print | nst before print | Spaces | Stars | Update after row |
//| ------- | ---------------- | ---------------- | ------ | ----- | ---------------- |
//| 1       | 1                | 7                | 1      | 7     | nsp=2, nst=5     |
//| 2       | 2                | 5                | 2      | 5     | nsp=3, nst=3     |
//| 3       | 3                | 3                | 3      | 3     | nsp=4, nst=1     |
//| 4       | 4                | 1                | 4      | 1     | nsp=5, nst=-1    |


// Second Method

        // Upper Part
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Part
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//📊 Upper Part Table (n = 5)
//| Row (i) | Spaces Formula (n-i) | Spaces Printed | Stars Formula (2*i-1) | Stars Printed |
//| ------- | -------------------- | -------------- | --------------------- | ------------- |
//| 1       | 5-1 = 4              | 4              | 2(1)-1 = 1            | 1             |
//| 2       | 5-2 = 3              | 3              | 2(2)-1 = 3            | 3             |
//| 3       | 5-3 = 2              | 2              | 2(3)-1 = 5            | 5             |
//| 4       | 5-4 = 1              | 1              | 2(4)-1 = 7            | 7             |
//| 5       | 5-5 = 0              | 0              | 2(5)-1 = 9            | 9             |

//📊 Lower Part Table (n = 5)
//| Row (i) | Spaces Formula (n-i) | Spaces Printed | Stars Formula (2*i-1) | Stars Printed |
//| ------- | -------------------- | -------------- | --------------------- | ------------- |
//| 4       | 5-4 = 1              | 1              | 2(4)-1 = 7            | 7             |
//| 3       | 5-3 = 2              | 2              | 2(3)-1 = 5            | 5             |
//| 2       | 5-2 = 3              | 3              | 2(2)-1 = 3            | 3             |
//| 1       | 5-1 = 4              | 4              | 2(1)-1 = 1            | 1             |