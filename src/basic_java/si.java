package basic_java;

import java.util.Scanner;

public class si {
    private static String system;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Principal :");
        double p = sc.nextDouble();
        System.out.print("enter the Rate of Interest :");
        double r = sc.nextDouble();
        System.out.print("enter the Time :");
        double t = sc.nextDouble();

        double si = p*r*t/100.0;
        System.out.println(si);
    }
}
