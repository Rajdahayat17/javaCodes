package if_else;

import java.util.Scanner;

public class sideOftraraginl {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take first side of triangle as input
        System.out.println("enter 1st side");
        int a = input.nextInt();

        // Take second side of triangle as input
        System.out.println("enter 2nd side");
        int b = input.nextInt();

        // Take third side of triangle as input
        System.out.println("enter 3rd side");
        int c = input.nextInt();

        // Check Triangle Inequality Theorem:
        // Sum of any two sides must be greater than the third side
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }

        // Close Scanner
        input.close();
    }
}