package Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        // Array declaration and initialization
        int[] arr = {6, 5, 4, 3, 2, 1};

        // Store array length
        int n = arr.length;

        // Two pointers
        // i starts from beginning
        // j starts from end
        int i = 0, j = n - 1;

        // Loop until both pointers meet
        while (i < j) {

            // Swap elements at i and j

            // Store left side element temporarily
            int temp = arr[i];

            // Copy right side element to left side
            arr[i] = arr[j];

            // Put stored value on right side
            arr[j] = temp;

            // Move left pointer forward
            i++;

            // Move right pointer backward
            j--;
        }

        // Print reversed array
        for (int ele : arr)
            System.out.print(ele + " ");
    }
}