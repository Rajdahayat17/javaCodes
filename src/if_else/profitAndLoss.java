package if_else;

import java.util.Scanner;

public class profitAndLoss {
    public static void main(String[] args){

        // User se input lene ke liye Scanner object
        Scanner sc = new Scanner(System.in);

        // Cost Price (CP) input lo
        System.out.println("Enter the cost price");
        double cp = sc.nextDouble();

        // Selling Price (SP) input lo
        System.out.println("Enter the selling price");
        double sp = sc.nextDouble();

        // Agar Selling Price, Cost Price se zyada hai
        // to profit hoga
        if(sp > cp){

            // Profit calculate karo
            double profit = sp - cp;
            System.out.println("Profit is " + profit);

            // Profit Percentage calculate karo
            // Formula: (Profit / CP) × 100
            double profit_p = (profit / cp) * 100;
            System.out.println("Profit Percentage = " + profit_p + "%");
        }

        // Agar Selling Price, Cost Price se kam hai
        // to loss hoga
        else if (sp < cp) {

            // Loss calculate karo
            double loss = cp - sp;
            System.out.println("Loss is " + loss);

            // Loss Percentage calculate karo
            // Formula: (Loss / CP) × 100
            double loss_p = (loss / cp) * 100;
            System.out.println("Loss Percentage = " + loss_p + "%");
        }

        // Agar SP aur CP barabar hain
        // to na profit hoga na loss
        else {
            System.out.println("No Profit No Loss");
        }
    }
}