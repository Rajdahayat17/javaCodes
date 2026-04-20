package Pattern_Printing;

import java.util.Scanner;

public class halfStarTriangle1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();


        // ⭐ Star Triangle
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 111 triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

        System.out.println();

        // 123 triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println();

        // AAA triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ABC triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // aaa triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // abc triangle
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + " ");              // odd row → numbers
                } else {
                    System.out.print((char)(j + 64) + " "); // even row → A B C
                }
            }
            System.out.println();
        }
    }
}
// iska j<=n+1-i logic
//| Row (i) | Calculation | j runs till | Output count |
//        | ------- | ----------- | ----------- | ------------ |
//        | 1       | 5+1-1 = 5   | 1 → 5       | 5 elements   |
//        | 2       | 5+1-2 = 4   | 1 → 4       | 4 elements   |
//        | 3       | 5+1-3 = 3   | 1 → 3       | 3 elements   |
//        | 4       | 5+1-4 = 2   | 1 → 2       | 2 elements   |
//        | 5       | 5+1-5 = 1   | 1 → 1       | 1 element    |

