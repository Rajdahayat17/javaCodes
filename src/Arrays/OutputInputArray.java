package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array declaration + initialization (fixed values)
        int[] arr = {5, 6, -4, 5, 46, -46};

        // Print length of array (total elements)
        System.out.println(arr.length); // output: 6

        // Store length in variable n
        int n = arr.length;

        // Loop to print array elements
        // i starts from 0 and goes till n-1
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // print each element
        }

        System.out.println(); // move to next line

        // Declare a new array of size 5 (default values = 0)
        int[] raj = new int[5];

        // Print default values of array
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.print(raj[i1] + " "); // prints: 0 0 0 0 0
        }

        System.out.println(); // move to next line

        // ----------- USER INPUT (1st time) -----------

        // Take input from user and store in array
        for (int i2 = 0; i2 < 5; i2++) {
            raj[i2] = sc.nextInt(); // user enters values
        }

        // Print entered values
        for (int i3 = 0; i3 < 5; i3++) {
            System.out.print(raj[i3] + " ");
        }

        System.out.println(); // move to next line

        // ----------- USER INPUT (2nd time) -----------

        // Again take input and overwrite previous values
        for (int i4 = 0; i4 < 5; i4++) {
            raj[i4] = sc.nextInt(); // new input values
        }

        // Print double of each element (2 * value)
        for (int i5 = 0; i5 < 5; i5++) {
            System.out.print(2 * raj[i5] + " "); // multiply by 2
        }
    }
}