package if_else;

import java.util.Scanner;

public class positiveNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        if(n >=0 ){
            System.out.println(n);
        }else {
            System.out.println(-n);
        }
    }
}
