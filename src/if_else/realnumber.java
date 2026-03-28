package if_else;

import java.util.Scanner;

public class realnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        double n= sc.nextDouble();
        int x= (int)n;
       if(n-x>0){ // input = 4 and  x=4 answer = interger why 4-4=0 that is integer
           // and intput is 6.5 and x=6 answer is  not interger why 6.5-6= 6 that is not interger
           System.out.println("not an  integer");
       }
       else {
           System.out.println("is a integer");
       }
    }
}
