package Arrays;// Import required classes
import java.util.Vector;
import java.util.Collections;

public class Adding_One_ {

    /*
     * Function:
     * Array ke form me diye gaye number me +1 add karna hai
     *
     * Example:
     * Input  -> [1, 2, 9]
     * Number -> 129
     * Output -> [1, 3, 0]
     */

    public static Vector<Integer> addOne(int[] arr) {

        // Final answer store karne ke liye Vector
        Vector<Integer> ans = new Vector<>();

        // Array ka size
        int n = arr.length;

        /*
         * Starting me carry = 1
         * Kyuki hume number me +1 add karna hai
         */
        int carry = 1;

        /*
         * Reverse direction me loop chalega
         * Last digit se addition start hota hai
         */
        for (int i = n - 1; i >= 0; i--) {

            // Current digit + carry
            int sum = arr[i] + carry;

            /*
             * Agar sum 9 se chhota ya equal hai
             * To directly add kar do
             */
            if (sum <= 9) {

                ans.add(sum);

                // Carry khatam
                carry = 0;
            }

            else {

                /*
                 * Agar sum = 10 ho gaya
                 * To digit 0 banegi
                 * Aur carry 1 rahega
                 */

                ans.add(0);

                carry = 1;
            }
        }

        /*
         * Agar loop ke baad bhi carry बची hai
         * Example:
         * [9,9,9] -> [1,0,0,0]
         */
        if (carry == 1) {
            ans.add(1);
        }

        /*
         * Answer reverse order me add hua tha
         * Isliye reverse karenge
         */
        Collections.reverse(ans);

        // Final answer return
        return ans;
    }

    // Main method
    public static void main(String[] args) {

        // Input array
        int[] arr = {9, 9, 9};

        // Function call
        Vector<Integer> result = addOne(arr);

        // Output print
        System.out.println("Result after adding 1: " + result);
    }
}