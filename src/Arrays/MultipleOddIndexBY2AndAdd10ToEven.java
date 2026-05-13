package Arrays;

public class MultipleOddIndexBY2AndAdd10ToEven {
    public static void main(String[] args) {

        // Array declaration and initialization
        int[] arr = {2, 3, 4, 5, 5, 7};

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if index is even
            if (i % 2 == 0) {

                // Add 10 to elements present at even index
                System.out.println(arr[i] + 10);
            }

            // If index is odd
            else

                // Multiply elements at odd index by 2
                System.out.println(arr[i] * 2);
        }
    }
}