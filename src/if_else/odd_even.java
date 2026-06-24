package if_else;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read a number from the user
        int n = sc.nextInt();

        // The modulus operator (%) gives the remainder
        // after division.
        //
        // If a number is divisible by 2, the remainder is 0,
        // so the number is even.
        //
        // Examples:
        // 8 % 2 = 0  -> Even
        // 10 % 2 = 0 -> Even
        if (n % 2 == 0) {
            System.out.println("even");
        }

        // If the remainder is not 0, the number is odd.
        //
        // Examples:
        // 7 % 2 = 1 -> Odd
        // 15 % 2 = 1 -> Odd
        else {
            System.out.println("odd");
        }
    }
}