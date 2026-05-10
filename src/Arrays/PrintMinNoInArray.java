package Arrays;

public class PrintMinNoInArray {
    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {59, 6, 5, 4, 8, 6, 22, 666, 889};

        // Assume first element is minimum initially
        int min = arr[0];

        // Loop through the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element is smaller than min
            if (arr[i] < min)

                // Update min with smaller value
                min = arr[i];
        }

        // Print minimum element of array
        System.out.println(min);
    }
}