package basic_java;

import java.util.Scanner;

public class squareOfaValue {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Declare variable to store the input value
        int a;

        // Ask user to enter a number
        System.out.print("enter value :");

        // Read the integer entered by the user
        a = sc.nextInt();

        // Calculate square of the number (a * a) and display it
        System.out.println("square is :" + a * a);
    }
}