package if_else;

import java.util.Scanner;

public class get3inputPrintGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int n = sc.nextInt();

        System.out.println("enter 2nd number");
        int m = sc.nextInt();

        System.out.println("enter 3rd number");
        int d = sc.nextInt();

        if (n > m && n > d) {
            System.out.println("Greatest number is: " + n);
        }
        else if (m > n && m > d) {
            System.out.println("Greatest number is: " + m);
        }
        else {
            System.out.println("Greatest number is: " + d);
        }

        sc.close();
    }
}