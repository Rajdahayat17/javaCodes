package Methods;

import java.util.Scanner;

public class PermutationAndCombination {

    // Method to calculate factorial of a number
    public static long fact(int x) {
        long f = 1;

        // Multiply all numbers from 1 to x
        // Example: 5! = 1 × 2 × 3 × 4 × 5 = 120
        for (int i = 1; i <= x; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read values of n and r
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        // Check if input is valid
        // r cannot be greater than n
        // n and r cannot be negative
        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid Input");
            return;
        }

        // Combination Formula:
        // nCr = n! / (r! * (n-r)!)
        long ncr = fact(n) / (fact(r) * fact(n - r));

        // Permutation Formula:
        // nPr = n! / (n-r)!
        long npr = fact(n) / fact(n - r);

        // Display the results
        System.out.println("Combination (nCr) = " + ncr);
        System.out.println("Permutation (nPr) = " + npr);

        sc.close();
    }
}