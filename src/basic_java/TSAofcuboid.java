package basic_java;

public class TSAofcuboid {
    public static void main(String[] args) {
        // formula of TSA  of cuboid 2(lb + bh + hl)
        int l = 2, b = 3, h = 4;
        int TSA;
        TSA = 2*(l*b + b*h + h*l);
        System.out.println(TSA);
    }
}
