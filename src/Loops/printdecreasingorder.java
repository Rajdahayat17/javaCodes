package Loops;

import java.util.Scanner;

public class printdecreasingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number");
        int n = sc.nextInt();
        //2,25,8,11......    // 1st method
        for (int i = 3 * n - 1; i >= 1; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // 2nd method
        // without using AP formula
        System.out.println("enter the n");
        int n1 = sc.nextInt();
        int a = 2 + (n1 - 1) * 3, d = 3;
        for (int i = n1; i >= 1;  i--) {
            System.out.print(a + " ");
            a -= d;
        }
    }
}

