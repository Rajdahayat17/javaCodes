package Loops;

public class printEvenNumberUnder100 {
    public static void main(String[] args){
        for( int i=1; i<=100;i++){  // ye ho gai fast method even number print karne ke
           if(i%2 == 0) System.out.print(i+" ");
        }
        System.out.println( );
        for( int j=0; j<=100;j=j+2){ // ye ho gya second method even number print karvane ki
            System.out.print(j+" ");} // without using if else condition
        System.out.println( );



        for( int i=1; i<=100;i++){  // ye ho gya third method table print karvane ki
            if(i%10 == 0) System.out.print(i+" ");
        }
        System.out.println( );
        for( int j=10; j<=100;j=j+10){ // ye ho gya fourth method table print karvane ki
            System.out.print(j+" ");} // without using if else condition


    }
}
