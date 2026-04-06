package Loops;

public class printOddNumberunder100 {
    public static void main(String[] args){
        for( int i=1; i<=100;i++){  // ye ho gai fast method even number print karne ke
            if(i%3 == 0) System.out.print(i+" ");
        }
        System.out.println( );
        for(int j=1; j<+100;j++){
            if(j%2 != 0) System.out.print(j+" ");
        }
    }
}
