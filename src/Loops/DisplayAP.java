package Loops;

import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Method 1: Using AP Formula --------
        System.out.println("Enter n number");
        int n = sc.nextInt();

        // AP: 2, 5, 8, 11, ...
        // First term (a) = 2
        // Common difference (d) = 3
        //
        // nth term formula:
        // an = a + (n - 1) * d
        //    = 2 + (n - 1) * 3
        //    = 3n - 1
        //
        // So the nth term is (3n - 1).
        // Loop starts from 2 and keeps adding 3
        // until it reaches the nth term.

        for (int i = 2; i <= 3 * n - 1; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println();

        // -------- Method 2: Without Using AP Formula --------
        System.out.println("Enter n");
        int n1 = sc.nextInt();

        int a = 2; // First term of AP
        int d = 3; // Common difference

        // Print n terms one by one.
        // After printing the current term,
        // generate the next term by adding d.
        for (int i = 1; i <= n1; i++) {
            System.out.print(a + " ");
            a += d; // Next term = current term + common difference
        }

        sc.close();
    }
}