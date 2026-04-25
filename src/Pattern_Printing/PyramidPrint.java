package Pattern_Printing;

import java.util.Scanner;

public class PyramidPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {      // Rows loop → total n lines print hongi

            for (int j = 1; j <= n - i; j++) {   // Spaces loop → har row me left side spaces
                System.out.print("  ");          // count = n - i
            }

            for (int j = 1; j <= 2 * i - 1; j++) { // Stars loop → pyramid ke stars
                System.out.print("* ");            // count = 2*i - 1
            }

            System.out.println();   // Next line me move karega
        }
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print((char)(96+i)+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for (int j=1; j<=2*i-1;j++){
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
//| Row (i) | Spaces (n-i) | Stars (2*i-1) | j runs till (spaces) | j runs till (stars) | Output count |
//| ------- | ------------ | ------------- | -------------------- | ------------------- | ------------ |
//| 1       | 5-1 = 4      | 2(1)-1 = 1    | 1 → 4                | 1 → 1               | 4 spaces + 1 star |
//| 2       | 5-2 = 3      | 2(2)-1 = 3    | 1 → 3                | 1 → 3               | 3 spaces + 3 stars |
//| 3       | 5-3 = 2      | 2(3)-1 = 5    | 1 → 2                | 1 → 5               | 2 spaces + 5 stars |
//| 4       | 5-4 = 1      | 2(4)-1 = 7    | 1 → 1                | 1 → 7               | 1 space + 7 stars |
//| 5       | 5-5 = 0      | 2(5)-1 = 9    | —                    | 1 → 9               | 0 space + 9 stars |

