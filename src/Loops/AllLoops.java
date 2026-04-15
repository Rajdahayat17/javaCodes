package Loops;

public class AllLoops {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=10;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        int j=1;
        while (j<=10){
            System.out.print(j+ " ");
            j++;
        }
        System.out.println();
        int z=1;
        do {  // bahut kam use hota hai ye
            System.out.print(z+ " ");
            z++;
        } while (z <= 10);
    }
}
