package Methods;

public class Argumnets {

    // sum method jisme 3 parameters hain (a, b, c)
    public static void sum(int a, int b, int c) {
        // yaha parameters ka use ho raha hai
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        // yaha method call ho raha hai aur 1, 2, 3 arguments hain
        sum(1, 2, 3);
    }
}