package Arrays;

public class Reverse_part_of_array {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        // Store array length
        int n = arr.length;
        // Starting index of part to reverse
        int i = 2;
        // Ending index of part to reverse
        int j = 4;
        // Reverse array part using two pointers
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
        // Print final array
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + " ");
        }
    }
}