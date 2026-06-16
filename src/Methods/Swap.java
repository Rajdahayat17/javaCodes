package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two numbers from the user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Print original values before swapping
        System.out.println(a + " " + b);

        // Store the value of a in a temporary variable
        int temp = a;

        // Assign the value of b to a
        a = b;

        // Assign the stored value of a (temp) to b
        b = temp;

        // Print values after swapping
        System.out.println(a + " " + b);
    }
}