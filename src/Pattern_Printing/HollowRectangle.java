package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();


        // ⭐ Star Triangle
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
