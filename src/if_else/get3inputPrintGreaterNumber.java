package if_else;

import java.util.Scanner;

public class get3inputPrintGreaterNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take first number as input
        System.out.println("Enter 1st number");
        int n = sc.nextInt();

        // Take second number as input
        System.out.println("Enter 2nd number");
        int m = sc.nextInt();

        // Take third number as input
        System.out.println("Enter 3rd number");
        int d = sc.nextInt();

        // Check if n is greater than both m and d
        // If true, n is the greatest number
        if (n > m && n > d) {
            System.out.println("Greatest number is: " + n);
        }

        // If n is not the greatest, check whether
        // m is greater than both n and d
        // If true, m is the greatest number
        else if (m > n && m > d) {
            System.out.println("Greatest number is: " + m);
        }

        // If neither n nor m is the greatest,
        // then d must be the greatest number
        else {
            System.out.println("Greatest number is: " + d);
        }

        sc.close();
    }
}