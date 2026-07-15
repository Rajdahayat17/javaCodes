package Arrays;

import java.util.ArrayList;

public class Array_List_javaBasic {
    public static void main(String[] args) {

        // Why use ArrayList?
        // Normal arrays have fixed size
        // But ArrayList size can grow or shrink dynamically

        // ArrayList declaration
        // Integer is wrapper class of int
        ArrayList<Integer> arr = new ArrayList<>();

        // add() -> inserts elements into ArrayList
        arr.add(21);
        arr.add(23);
        arr.add(32);
        arr.add(31);

        // get(index) -> returns element at specific index
        System.out.println(arr.get(3));
        System.out.println(arr.get(2));

        // set(index, value)
        // updates value at given index
        arr.set(2, 44);


        // Print updated element
        System.out.println(arr.get(2));

        // Directly print complete ArrayList
        System.out.println(arr);

        // size() -> gives total number of elements
        int n = arr.size();

        // Traverse ArrayList using normal for loop
        for (int i = 0; i < n; i++) {

            // get(i) accesses element at index i
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // Enhanced for loop / for-each loop
        // Directly accesses elements one by one
        for (int ne : arr) {
            System.out.print(ne + " ");
        }

        System.out.println();

        // add(value)
        // adds new element at the end of ArrayList
        arr.add(56);

        // Print updated ArrayList
        System.out.println(arr);

        // add(index, value)
        // inserts element at specific index
        // existing elements shift to the right
        arr.add(1, 200);

        // Print updated ArrayList
        System.out.println(arr);

        // remove(index)
        // removes element from given index
        // remaining elements shift left
        arr.remove(4);

        // Print ArrayList after removal
        System.out.println(arr);

        // -----------------------------------------
        // Reverse ArrayList using two-pointer method
        // -----------------------------------------

        int i1 = 0;                  // starting index
        int j1 = arr.size() - 1;    // ending index

        while (i1 < j1) {

            // Store left value temporarily
            int temp = arr.get(i1);

            // Put right value at left side
            arr.set(i1, arr.get(j1));

            // Put temp value at right side
            arr.set(j1, temp);

            // Move pointers
            i1++;
            j1--;
        }

        // Print reversed ArrayList
        System.out.println(arr);
    }
}