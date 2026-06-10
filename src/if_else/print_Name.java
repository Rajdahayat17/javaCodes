package if_else;

import java.util.Scanner;

public class print_Name {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("enter the number");

        // Read the number entered by the user
        int nane = sc.nextInt();

        // Check if the number is divisible by both 5 and 3
        if (nane % 5 == 0 && nane % 3 == 0) {
            System.out.println("Raj Dahayat");
        }

        // Check if the number is divisible only by 5
        else if (nane % 5 == 0) {
            System.out.println("Raj");
        }

        // Check if the number is divisible only by 3
        else if (nane % 3 == 0) {
            System.out.println("Dahayat");
        }

        // Execute when the number is divisible by neither 5 nor 3
        else {
            System.out.println("Nothing");
        }

        // Close Scanner to free resources
        sc.close();
    }
}