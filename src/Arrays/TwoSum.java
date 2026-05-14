package Arrays;

public class TwoSum {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {16,2, 5, 7, 9, 13};

        // Target value
        int target = 16;

        // Array length
        int n = arr.length;

        // Traverse array
        for (int i = 0; i < n; i++) {

            // Check pairs with next elements
            for (int j = i + 1; j < n; j++) {

                // Check sum equals target
                if (arr[i] + arr[j] == target) {

                    // Print true if pair found
                    System.out.println("true");

                    // Stop program
                    return;
                }
            }
        }

        // If no pair found
        System.out.println("false");
    }
}