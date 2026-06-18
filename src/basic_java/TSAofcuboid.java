package basic_java;

public class TSAofcuboid {
    public static void main(String[] args) {

        // Total Surface Area (TSA) of a cuboid is calculated using:
        // TSA = 2 × (length × breadth + breadth × height + height × length)

        // Declare and initialize the dimensions of the cuboid
        int l = 2; // length
        int b = 3; // breadth
        int h = 4; // height

        // Variable to store the Total Surface Area
        int TSA;

        // Calculate TSA using the formula
        TSA = 2 * (l * b + b * h + h * l);

        // Display the calculated TSA
        System.out.println(TSA);
    }
}