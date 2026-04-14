package Loops;

public class continues {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.println(i);
            if(i==13)continue; // continue ka mtlb hota hai kisi ko skip karna jaise isme 13 skip ho gya
            System.out.println("welcome");
        }
    }
}
