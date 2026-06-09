package basic_java;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        // Initialize variable a with value 29
        int a = 29;
        System.out.println(a); // Output: 29

        // Add 8 to a and store the result back in a
        a = a + 8;
        System.out.println(a); // Output: 37

        // Initialize variable x with value 10
        int x = 10;
        System.out.println(x); // Output: 10

        // Shorthand operator: x = x + 6
        x += 6;
        System.out.println(x); // Output: 16

        // Shorthand operator: x = x * 6
        x *= 6;
        System.out.println(x); // Output: 96

        // Shorthand operator: x = x - 6
        x -= 6;
        System.out.println(x); // Output: 90

        // Initialize variable y with value 20
        int y = 20;

        // Post-increment: first use value, then increase by 1
        y++;
        System.out.println(y); // Output: 21

        // Pre-increment: first increase by 1, then use value
        ++y;
        System.out.println(y); // Output: 22

        // Reassign y to 5
        y = 5;

        // Post-decrement: first use value, then decrease by 1
        y--;
        System.out.println(y); // Output: 4

        // Pre-decrement: first decrease by 1, then use value
        --y;
        System.out.println(y); // Output: 3

        // Demonstrating post-increment
        int d = 10;

        // z gets current value of d (10), then d becomes 11
        int z = d++;
        System.out.println(d + " " + z); // Output: 11 10

        // Demonstrating pre-increment
        int i = 10;

        // i becomes 11 first, then i1 gets 11
        int i1 = ++i;
        System.out.println(i + " " + i1); // Output: 11 11
    }
}