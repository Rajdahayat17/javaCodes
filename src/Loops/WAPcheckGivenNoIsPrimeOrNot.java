package Loops;

import java.util.Scanner;

public class WAPcheckGivenNoIsPrimeOrNot {
    public static  void main(String[] args){
       // Scanner sc= new Scanner(System.in);
        //int n= sc.nextInt();
       // System.out.println("Enter the number : ");
        int n = 55;
        boolean isPrime = true;

        if(n <= 1) isPrime = false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

    }
}
