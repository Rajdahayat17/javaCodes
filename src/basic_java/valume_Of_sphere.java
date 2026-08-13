package basic_java;

public class valume_Of_sphere {
    public static void main(String[] args) {

        // Formula for volume of a sphere:
        // Volume = (4/3) × π × r³
        int r = 6;

        // Store the calculated volume in a double
        // because the result can contain decimal values.
        double volume;

        // Calculate volume:
        // 4.0/3 ensures decimal division instead of integer division.
        // r * r * r calculates r³.
        volume = (4.0 / 3) * 3.14 * r * r * r;

        // Print the calculated volume
        System.out.println(volume);
    }
}