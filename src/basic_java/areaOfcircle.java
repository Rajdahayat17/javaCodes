package basic_java;

import java.util.Scanner;

public class areaOfcircle {
    public static void main(String[] args){
     // area of circle formula = pi*r*r
        Scanner sc= new Scanner(System.in); // input from user in runtime
        System.out.println("enetr redius");
         double r = sc.nextInt();
         double value;
         value= 3.14*r*r;
        System.out.println(value);
    }
}
