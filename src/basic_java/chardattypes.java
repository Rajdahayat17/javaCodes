package basic_java;

public class chardattypes {
    public static  void main(String[] args){
        char a = 'a';
        System.out.println(a);
        char b = 'b';
        System.out.println(b);

        // typecasting ek data type se dusre data dtype me conversion
        char ch ='A';
        int x = ch; //  impicit typecasting
        System.out.println(x);

        char raj = '$';
        int y = (int)raj;// explicit typecasting
        System.out.println(y);

        char ch1 = 'B';
        System.out.println(ch1+3);

        // int to char
        int z= 69;
        char  ch2= (char)z;
        System.out.println(ch2);

    }
}
