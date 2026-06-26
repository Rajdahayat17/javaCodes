package if_else;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int a = sc.nextInt();

        System.out.println("enter 2nd number");
        int b = sc.nextInt();

        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        // First compare a with b
        if (a >= b) {

            // If a is greater than or equal to b,
            // then compare a with c
            if (a >= c) {

                // a is greater than or equal to both b and c
                // So, print a
                System.out.println(a);
            }

            // If c is greater than a,
            // then c is the greatest number
            else
                System.out.println(c);

        } else {

            // If b is greater than a,
            // then compare b with c
            if (b >= c) {

                // b is greater than or equal to both a and c
                // So, print b
                System.out.println(b);
            }

            // If c is greater than b,
            // then c is the greatest number
            else
                System.out.println(c);
        }
    }
}