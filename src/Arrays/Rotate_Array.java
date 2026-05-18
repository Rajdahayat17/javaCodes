package Arrays;

public class Rotate_Array {

    // Function to rotate array by d positions
    static void rotateArr(int arr[], int d) {

        // Store array length
        int n = arr.length;

        // If d is greater than array size
        // Example:
        // d = 7 and n = 5
        // then 7 % 5 = 2
        d = d % n;

        // Step 1:
        // Reverse first d elements
        // Example:
        // 1 2 | 3 4 5
        // becomes
        // 2 1 | 3 4 5
        reverse(arr, 0, d - 1);

        // Step 2:
        // Reverse remaining elements
        // Example:
        // 2 1 | 3 4 5
        // becomes
        // 2 1 | 5 4 3
        reverse(arr, d, n - 1);

        // Step 3:
        // Reverse complete array
        // Example:
        // 2 1 5 4 3
        // becomes
        // 3 4 5 1 2
        reverse(arr, 0, n - 1);
    }

    // Function to reverse array from index i to j
    static void reverse(int[] arr, int i, int j) {

        // Run loop until both pointers meet
        while (i < j) {

            // Swap elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move left pointer forward
            i++;

            // Move right pointer backward
            j--;
        }
    }

    // Function to print array
    static void printArray(int[] arr) {

        // For-each loop to print elements
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {

        // Array declaration
        int[] arr = {1, 2, 3, 4, 5};

        // Rotate array by 2 positions
        int d = 2;

        // Function call
        rotateArr(arr, d);

        // Print final rotated array
        System.out.println("Rotated Array:");
        printArray(arr);
    }
}