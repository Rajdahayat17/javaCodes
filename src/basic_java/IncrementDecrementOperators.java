package basic_java;

public class IncrementDecrementOperators {
    public static  void main(String[] args){

        int a = 29;
        System.out.println(a);
        a =  a+8;
        System.out.println(a );

        int x=10;
        System.out.println(x);
        x +=6;
        System.out.println(x);
        x *=6;
        System.out.println(x);
        x -=6;
        System.out.println(x);

       int  y=20;
        y++;
        System.out.println(y);
        ++y;
        System.out.println(y);
        y=5;
        y--;
        System.out.println(y);
        --y;
        System.out.println(y);

        int d=10;
        int z=d++;
        System.out.println(d+ " " +z);

        int i=10;
        int i1=++i;
        System.out.println(i+ " " +i1);
    }
}
