package Arrays;

import java.util.Arrays;

public class ShalowCopyDeepCopy {
    public static void main(String[] args) {

        int a = 4; // primitive variable (4 bytes)

        // Original array
        int[] arr = {10, 14, 12, 15, 34};

        // Shallow copy
        // x and arr both point to same array
        int[] x = arr;

        // Changing x also changes arr
        x[0] = 100;

        System.out.println(arr[0]); // output: 100

        // Deep copy (new separate array created)
        int[] deep = Arrays.copyOf(arr, arr.length);

        // Change deep copy
        deep[0] = 500;

        // Print deep copy value
        System.out.println(deep[0]); // output: 500
    }
}