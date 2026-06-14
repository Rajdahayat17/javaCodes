package if_else;

import java.util.Scanner;

public class ternaryVarible {
    public static void main(String[] args) {

        // User se input lene ke liye Scanner object banaya
        Scanner sc = new Scanner(System.in);

        // User se number input karne ko bola
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        /*
         * Ternary Operator:
         * Syntax:
         * condition ? value_if_true : value_if_false;
         *
         * Agar n >= 0 hai to abhi me 100 store hoga,
         * warna abhi me 0 store hoga.
         */
        int abhi = (n >= 0) ? 100 : 0;

        // Variable ki value print karo
        System.out.println(abhi);
    }
}