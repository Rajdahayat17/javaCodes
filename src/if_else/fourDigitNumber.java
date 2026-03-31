package if_else;

import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if(number > 999 && number < 10000){
            System.out.println("4 digit number");
        }else{
            System.out.println("Not a 4 Digit Number");
        }
    }
}
