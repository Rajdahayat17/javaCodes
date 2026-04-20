package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        // ⭐ Star Triangle
        for (int i=1;i<=row;i++){
            for (int j=1; j<=col; j++){
                if (i==1 || i==row || j==1 || j==col) {
                    System.out.print( "* ");              // odd row → numbers
                } else {
                    System.out.print("  "); // even row → A B C
                }
            }
            System.out.println();
    }
}
}
