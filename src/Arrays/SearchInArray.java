package Arrays;

public class SearchInArray {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {45, 65, 34, 78, 25};

        // Element to search
        int x = 29;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Check if element is present
            if (arr[i] == x) {

                // Print message if found
                System.out.println("Yes Element Present");

                // Stop loop
                break;
            }

            // If loop reaches last index
            // and element is still not found
            if (i == arr.length - 1) {
                System.out.println("Element Is Not Present");
            }
        }
    }
}