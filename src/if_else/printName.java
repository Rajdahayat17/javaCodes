package if_else;

import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int nane = sc.nextInt();
        if(nane % 5 == 0) {
            System.out.println("Raj");
        }
        if(nane % 3 == 0){
            System.out.println("Dahayat");
        }
        if (nane % 5 == 0 && nane % 3 == 0) {
            System.out.println("Raj Dahayat");
        }
        else System.out.println("Nothing");
    }
}
