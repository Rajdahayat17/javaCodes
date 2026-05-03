package Methods;

import java.util.Scanner;

public class MaxOfThreeBUiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Highest Number : "+ Math.max(Math.max(a,b),c));
        System.out.println("Min Number : "+ Math.min(Math.min(a,b),c));
    }
}



// reuse builty ko badne ke liye fuction ka use karte hai