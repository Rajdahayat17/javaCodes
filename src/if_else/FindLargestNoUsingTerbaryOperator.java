package if_else;

import java.util.Scanner;

public class FindLargestNoUsingTerbaryOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int a = sc.nextInt();

        System.out.println("enter 2nd number");
        int b = sc.nextInt();

        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        int max = (a >= b) ?
                ((a >= c) ? a : c)
                :
                ((b >= c) ? b : c);

        System.out.println("Largest number is: " + max);
    }
}