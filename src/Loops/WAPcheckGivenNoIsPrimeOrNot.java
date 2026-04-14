package Loops;

import java.util.Scanner;

public class WAPcheckGivenNoIsPrimeOrNot {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        boolean Prime = true;

        if(n <= 1){
            Prime = false;
        }

        for (int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                Prime = false;
                break;
            }
        }

        if(Prime){
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
        }
    }

