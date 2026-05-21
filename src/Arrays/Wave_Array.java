package Arrays;

public class Wave_Array {
    public static void main(String[] args) {

        // Array declaration and initialization
        int[] arr = {1, 2, 3, 4, 5};

        // Traverse array by jumping 2 indexes
        // i = 0, 2, 4 ...
        for (int i = 0; i < arr.length; i += 2) {

            // If last element has no pair,
            // stop loop
            if (i == arr.length - 1)
                break;

            // Swap adjacent elements

            // Store current element temporarily
            int temp = arr[i];

            // Copy next element to current index
            arr[i] = arr[i + 1];

            // Put stored value at next index
            arr[i + 1] = temp;
        }

        // Print wave array
        for (int i1 = 0; i1 < arr.length; i1++)

            System.out.println(arr[i1]);
    }
}