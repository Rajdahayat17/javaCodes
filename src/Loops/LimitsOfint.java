package Loops;

public class LimitsOfint {
    public static void main(String[] args) {

        // Integer limits
        // MAX_VALUE stores the largest value that can be held by an int (32 bits)
        int x = Integer.MAX_VALUE;

        // MIN_VALUE stores the smallest value that can be held by an int
        int y = Integer.MIN_VALUE;

        // Long limits
        // MAX_VALUE stores the largest value that can be held by a long (64 bits)
        long a = Long.MAX_VALUE;

        // MIN_VALUE stores the smallest value that can be held by a long
        long b = Long.MIN_VALUE;

        // Character limits
        // char is an unsigned 16-bit data type in Java
        // MAX_VALUE represents the largest Unicode value (65535)
        char u = Character.MAX_VALUE;

        // MIN_VALUE represents the smallest Unicode value (0)
        char w = Character.MIN_VALUE;

        // Display int limits
        System.out.println(x);
        System.out.println(y);

        // Display long limits
        System.out.println(a);
        System.out.println(b);

        // char values are displayed as integers using type casting
        // because printing them directly may show Unicode characters
        System.out.println((int) u); // 65535
        System.out.println((int) w); // 0
    }
}