package Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        // Array declaration
        int[] arr = {5, 6, 7, 8, 3};

        // for-each loop
        // Ye loop array ke har element ko ek-ek karke access karta hai
        for (int ele : arr) {

            // Current element print hoga
            System.out.println(ele + " ");
        }

        // Important:
        // for-each loop ki help se hum array elements ko directly
        // modify/change nahi kar sakte.
        // Ye mainly reading ya printing ke liye use hota hai.
    }
}