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

        if (a>=b){
            if(a>=c){
                System.out.println(a);
            }
            else System.out.println(c);
        }else {
            if (b>=c){
                System.out.println(b);
            }
            else System.out.println(c);
        }
    }
}
