package if_else;

import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take a number as input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // A 4-digit number lies between 1000 and 9999
        //
        // number > 999  means number is at least 1000
        // number < 10000 means number is at most 9999
        //
        // Both conditions must be true, so we use &&
        if (number > 999 && number < 10000) {
            System.out.println("4 digit number");
        } else {

            // If the number is less than 1000
            // or greater than 9999,
            // then it is not a 4-digit number
            System.out.println("Not a 4 Digit Number");
        }

        input.close();
    }
}