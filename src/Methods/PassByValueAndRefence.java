package Methods;

public class PassByValueAndRefence {

    // Ye method ek parameter 'x' leta hai
    public static void change(int x) {

        // Yaha x ki value 10 set ki ja rahi hai
        // Lekin ye sirf local copy hai (original variable change nahi hota)
        x = 10;
    }

    public static void main(String[] args) {

        // Original variable x ki value 6 hai
        int x = 6;

        // Pehla print → 6
        System.out.println(x);

        // Method call me x ki value pass hui (copy pass hoti hai)
        change(x);

        // Dusra print → fir bhi 6 (kyunki original value change nahi hui)
        System.out.println(x);
    }
}