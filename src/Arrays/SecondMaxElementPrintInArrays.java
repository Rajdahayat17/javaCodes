package Arrays;

public class SecondMaxElementPrintInArrays {

    public static void main(String[] args) {

        // Array declaration
        int[] arr = {3, 34, 36, 45, 35, 2, 74};

        // max stores largest element
        int max = Integer.MIN_VALUE;

        // smax stores second largest element
        int smax = Integer.MIN_VALUE;

        // Finding maximum element
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than max
            if (arr[i] > max) {

                // Update max
                max = arr[i];
            }
        }

        // Finding second maximum element
        for (int j = 0; j < arr.length; j++) {

            // Check:
            // 1. Current element is greater than smax
            // 2. Current element should not be equal to max
            if (arr[j] > smax && arr[j] != max) {

                // Update second max
                smax = arr[j];
            }
        }

        // Print maximum element
        System.out.println(max);

        // Print second maximum element
        System.out.println(smax);
    }
}
//second approach ye bhi ho sakti hai ek  loop me


//int[] arr = {3, 34, 36, 45, 35, 2, 74};
//
//int max = Integer.MIN_VALUE;
//int smax = Integer.MIN_VALUE;
//
//for (int i = 0; i < arr.length; i++) {
//
//        // Agar current element max se bada hai
//        if (arr[i] > max) {
//
//// Purana max second max ban jayega
//smax = max;
//
//// New max update
//max = arr[i];
//        }
//
//        // Agar current element:
//        // 1. max se chhota ho
//        // 2. second max se bada ho
//        else if (arr[i] > smax && arr[i] != max) {
//
//// Update second max
//smax = arr[i];
//        }
//        }
//
//        System.out.println("Max = " + max);
//System.out.println("Second Max = " + smax);