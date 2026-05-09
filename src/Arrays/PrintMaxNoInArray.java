package Arrays;

public class PrintMaxNoInArray {
    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {2, 8, 6, 55, 99, 88, 66, 55};

        // Assume first element is maximum initially
        int max = arr[0];

        // Loop through the entire array
        for (int i = 0; i < arr.length; i++) {

            // Compare current element with max
            // If current element is greater,
            // then update max value
            if (arr[i] > max)

                // Store new maximum value
                max = arr[i];
        }

        // Print the largest element of array
        System.out.println(max);
    }
}