package Loops;

import java.util.Scanner;

public class Araisetothepowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the base number (a)
        int a = sc.nextInt();

        // Read the exponent (b)
        int b = sc.nextInt();

        // Initialize result to 1 because any number raised to the power 0 is 1
        int pow = 1;

        // Multiply the base 'a' by itself 'b' times
        // Example: a = 2, b = 3
        // Iteration 1: pow = 1 * 2 = 2
        // Iteration 2: pow = 2 * 2 = 4
        // Iteration 3: pow = 4 * 2 = 8
        for (int i = 1; i <= b; i++) {
            pow *= a; // Equivalent to: pow = pow * a;
        }

        // Print the final result (a^b)
        System.out.println(pow);
    }
}