package if_else;

import java.util.Scanner;

public class realnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        double n = sc.nextDouble();

        // Type casting converts the decimal number into an integer
        // Any fractional part is removed
        // Example:
        // n = 6.5  -> x = 6
        // n = 4.0  -> x = 4
        int x = (int) n;

        // If the difference between the original number and
        // the integer part is greater than 0, then the number
        // contains a decimal part and is NOT an integer.
        //
        // Examples:
        // n = 6.5, x = 6
        // n - x = 0.5 > 0  -> Not an Integer
        //
        // n = 4.0, x = 4
        // n - x = 0 -> Integer
        if (n - x > 0) {
            System.out.println("Not an Integer");
        } else {
            System.out.println("Is an Integer");
        }
    }
}