package Methods;

import java.util.Scanner;

public class MaxOfThreeBUiltIn {

    public static void main(String[] args) {

        // Scanner object banaya user se input lene ke liye
        Scanner sc = new Scanner(System.in);

        // User ko message
        System.out.println("Enter the numbers:");

        // 3 integers input le rahe hain
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Math.max() built-in method ka use karke sabse bada number nikal rahe hain
        // Pehle a aur b me se bada, fir usme c compare
        System.out.println("Highest Number : " + Math.max(Math.max(a, b), c));

        // Math.min() built-in method ka use karke sabse chhota number nikal rahe hain
        System.out.println("Min Number : " + Math.min(Math.min(a, b), c));

        // Scanner close karna good practice hota hai
        sc.close();
    }
}

// Note:
// Built-in functions (jaise Math.max, Math.min) ka use code reuse aur easy banata hai