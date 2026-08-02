package basic_java;

import org.w3c.dom.ls.LSOutput;

public class divisionOfDatatypes {
    public static void main(String[] args) {

        // Both 5 and 2 are integers.
        // Integer division removes the decimal part.
        // 5 / 2 = 2, then 2 is stored in double y as 2.0
        double y = 5 / 2;
        System.out.println(y);

        // Type casting converts 5 to a double before division.
        // Now the operation becomes 5.0 / 2.
        // Since one operand is double, Java performs floating-point division.
        // Result = 2.5
        double x = (double) 5 / 2;
        System.out.println(x);

    }
}