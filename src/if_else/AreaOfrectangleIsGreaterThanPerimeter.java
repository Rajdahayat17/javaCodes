package if_else;

import java.util.Scanner;

public class AreaOfrectangleIsGreaterThanPerimeter {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("enter the number 1");
        int l = inout.nextInt();
        System.out.println("enter the number 2");
        int b = inout.nextInt();

        int  area = l * b ;
        int perimeter = 2 * (l + b);
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
        if(area > perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else {
            System.out.println("Area is less than perimeter");
        }
    }
}
