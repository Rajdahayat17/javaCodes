package if_else;

import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

//        if (n % 2 == 0) {     // ye chiz hm jb use karet hai jab ham if ekse use karet hai ek or method hai is ko find karne ki
//            System.out.println("even number");
//        }else System.out.println("odd number");
        System.out.println(n%2 ==0 ? "even" : "odd");

    }
}
