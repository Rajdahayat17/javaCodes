package basic_java;

import java.util.Scanner;

public class si {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input principal amount (initial money)
        System.out.print("Enter the Principal: ");
        double p = sc.nextDouble();

        // Input rate of interest per year
        System.out.print("Enter the Rate of Interest: ");
        double r = sc.nextDouble();

        // Input time period
        System.out.print("Enter the Time: ");
        double t = sc.nextDouble();

        // Calculate Simple Interest using the formula:
        // SI = (Principal × Rate × Time) / 100
        double si = p * r * t / 100.0;

        // Display the calculated Simple Interest
        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}