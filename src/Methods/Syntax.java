package Methods;

public class Syntax {

    // Ye ek simple method hai (no parameter, no return)
    public static void raj() {
        System.out.println("Dahayat");
    }

    public static void main(String[] args) {
        // Program execution hamesha main() se start hota hai

        System.out.println("Rahul");

        raj(); // method call (raj() method ko call kiya)

        // Agar kisi method ko call nahi karoge to wo execute nahi hoga

        abhi();  // abhi() method call
        jatin(); // jatin() method call
    }

    // Ye method sirf ek print statement execute karta hai
    public static void abhi() {
        System.out.println("verma");
    }

    public static void jatin() {
        System.out.println("kushwaha");

        // Nested method calls (ek method ke andar dusre method call karna)
        brajesh();
        chetan();
    }

    public static void brajesh() {
        System.out.println("pathak");
    }

    public static void chetan() {
        System.out.println("shrivas");
    }
}