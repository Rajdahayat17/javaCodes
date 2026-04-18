package Pattern_Printing;

import java.util.Scanner;

public class helfStarTriangle {
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
