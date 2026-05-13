package Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {

        // Array declaration and initialization
        int[] arr = {1, 2, 4, 335, -34, 3};

        // Print original array
        System.out.println("Original Array:");
        print(arr);

        // Built-in method to sort array in ascending order
        Arrays.sort(arr);

        // Print sorted array
        System.out.println("Sorted Array:");
        print(arr);
    }

    // Method to print array elements
    public static void print(int[] arr) {

        // Traverse array using loop
        for (int i = 0; i < arr.length; i++) {

            // Print each element
            System.out.print(arr[i] + " ");
        }

        // Move cursor to next line
        System.out.println();
    }
}