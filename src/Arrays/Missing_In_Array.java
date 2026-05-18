package Arrays;

public class Missing_In_Array {

    public static void main(String[] args) {

        // Array with one missing number
        int[] arr = {1, 2, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            // Create object of class
            Missing_In_Array obj = new Missing_In_Array();

            // Call method and store answer
            int ans = obj.missingNum(arr);

            // Print missing number
            System.out.println("Missing Number is: " + ans);
        }

    // Method to find missing number
    int missingNum(int arr[]) {

        // Actual count of numbers including missing number
        long n = arr.length + 1;

        // Sum of numbers from 1 to n
        // Formula: n(n + 1) / 2
        long sum = n * (n + 1) / 2;

        // Variable to store array sum
        long arraySum = 0;

        // Traverse array and calculate sum
        for (int ele : arr) {

            // Add current element into arraySum
            arraySum += ele;
        }

        // Missing number = Expected sum - Actual array sum
        return (int) (sum - arraySum);
    }
}