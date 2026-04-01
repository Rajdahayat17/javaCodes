package if_else;

import java.util.Scanner;

public class fibdTheLies1stQuadrant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter x value ");
        int x = in.nextInt();
        System.out.println("enter y value ");
        int y = in.nextInt();
/*

Jab tum graph banate ho (maths me), wahan 2 lines hoti hain:

Horizontal line → X-axis
Vertical line → Y-axis

Dono jahan milti hain → us point ko Origin kehte hain
1st Quadrant → x +, y +
2nd Quadrant → x -, y +
3rd Quadrant → x -, y -
4th Quadrant → x +, y -  */

        if (x == 0 && y == 0){
            System.out.println(" x or y value");
        } else if (x==0) {
            System.out.println(" x value");
        }else if (y==0) {
            System.out.println(" y value");
        } else if (x > 0 && y > 0) {
            System.out.println("1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th quadrant");
        }
    }
}
