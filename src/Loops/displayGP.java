package Loops;

import java.util.Scanner;

public class displayGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        int a = 1; // first term
        int r = 2; // common ratio

        // 🔹 Method 1: Without Formula
        System.out.println("GP without formula:");
        int term1 = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term1 + " ");
            term1 = term1 * r;
        }

        System.out.println();

        // 🔹 Method 2: Using Formula
        System.out.println("GP using formula:");
        for (int i = 1; i <= n; i++) {
            int term2 = (int)(a * Math.pow(r, i - 1));
            System.out.print(term2 + " ");
        }

        sc.close();
    }
}