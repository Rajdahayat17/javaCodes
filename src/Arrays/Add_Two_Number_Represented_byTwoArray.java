package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Add_Two_Number_Represented_byTwoArray {

    public static ArrayList<Integer> findArraySum(int[] arr1, int[] arr2) {
        int i = arr1.length - 1; // arr1 ka last index
        int j = arr2.length - 1; // arr2 ka last index
        int carry = 0;

        ArrayList<Integer> result = new ArrayList<>();

        // Right-to-left iterate karo jab tak dono arrays ya carry bacha hai
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            // Digit ko result me add karo aur carry update karo
            carry = sum / 10;
            result.add(sum % 10);
        }

        // Addition humne right-to-left kiya tha, toh result ko reverse karna padega
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9};
        int[] arr2 = {1};
        ArrayList<Integer> ans = findArraySum(arr1, arr2);

        System.out.println("Sum: " + ans); // Output: [1, 0, 0, 0]
    }
}