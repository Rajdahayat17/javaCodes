package if_else;

import java.util.Scanner;


public class profitAndLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price");
        double cp = sc.nextDouble();;
        System.out.println("enter the selling price");
        double sp = sc.nextDouble();
        if(sp>cp){
            double profit = (sp-cp);
            System.out.println("profit is "+ profit);
            double profit_p = (profit/cp)*100;
            System.out.println(profit_p);}

            else if (sp<cp) {
            double loss = (cp-sp);
            System.out.println("loss is "+  loss );
            double loss_p = (loss/cp)*100;
            System.out.println(loss_p);
        }
        else
        System.out.println("no profit no  loss");
    }
}
