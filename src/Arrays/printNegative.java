package Arrays;

import java.util.Scanner;

public class printNegative {
    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter array size
        System.out.println("Enter Array Size");

        // Store array size in variable n
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        // Ask user to enter array elements
        System.out.println("Enter Array Element");

        // Loop to take input from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // store input in array
        }

        // Printing negative values from array
        System.out.println("Negative Elements are:");

        // Loop to check each element
        for (int i = 0; i < n; i++) {

            // Condition to check negative number
            if (arr[i] < 0)

                // Print negative element
                System.out.print(arr[i] + " ");
        }
    }
}