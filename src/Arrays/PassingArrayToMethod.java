package Arrays;

public class PassingArrayToMethod {

    public static void main(String[] args) {

        // Array declaration
        int x[] = {10, 3, 29, 39};
        System.out.println(x[2]);
        // Method call
        change(x);

        // Print updated value
        System.out.println(x[2]);
    }

    // Method to modify array
    public static void change(int[] x) {

        // Change value at index 2
        x[2] = 99;
    }
}