package Arrays;

import java.util.Arrays;

public class Segregate_0s_And_1st {

    // Function to separate 0s and 1s
    static void segregate0and1(int[] arr) {

        // Left pointer
        int left = 0;

        // Right pointer
        int right = arr.length - 1;

        // Run loop until pointers meet
        while (left < right) {

            // If left side already has 0
            if (arr[left] == 0) {
                left++;
            }

            // If right side already has 1
            else if (arr[right] == 1) {
                right--;
            }

            // Swap when left has 1 and right has 0
            else {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move both pointers
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        // Print before segregation
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        // Function call
        segregate0and1(arr);

        // Print after segregation
        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
    }
}