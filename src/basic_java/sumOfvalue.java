package basic_java;

import java.util.Scanner;

public class sumOfvalue {
    public static void main(String[] args) {

        // Declare three integer variables
        int a, b, c;

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take first number as input
        System.out.println("Enter 1st number");
        a = sc.nextInt();

        // Take second number as input
        System.out.println("Enter 2nd number");
        b = sc.nextInt();

        // Take third number as input
        System.out.println("Enter 3rd number");
        c = sc.nextInt();

        // Add all three numbers and print the result
        System.out.println(a + b + c);

        sc.close();
    }
}