package Pattern_Printing;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();


        // ⭐ Star Triangle
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 111 triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

        System.out.println();

        // 123 triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println();

        // AAA triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ABC triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // aaa triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // abc triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }
}