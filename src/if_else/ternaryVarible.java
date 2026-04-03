package if_else;

import java.util.Scanner;

public class ternaryVarible {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number :");
         int n = sc.nextInt();

         int abhi = (n>=0)? 100 :0;
         System.out.println("abhi");
     }
}
