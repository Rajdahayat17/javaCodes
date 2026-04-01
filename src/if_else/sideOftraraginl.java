package if_else;

import java.util.Scanner;

public class sideOftraraginl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 15" +
                "st side");
        int a = input.nextInt();
        System.out.println("enter 2nd side");
        int b = input.nextInt();
        System.out.println("enter 3rd side");
        int c = input.nextInt();

        if(a+b>c &&  b+c>a && c+a>b){
            System.out.println("valid triangle");
        }
        else {
            System.out.println("invalid triangle");
        }
    }
}
