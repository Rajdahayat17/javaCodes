package Loops;

import java.util.Scanner;

public class displayGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number");
        int n = sc.nextInt();
        //2,25,8,11......    // 1st method
        for (int i = 2; i <= 3 * n - 1; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // 2nd method
        // without using GP formula
        System.out.println("enter the n");
        int n1 = sc.nextInt();
        int a = 1, r = 2;
        for (int i = 1; i <= n1; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
