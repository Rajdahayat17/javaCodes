package Methods;

public class ReturnType2 {

    // Ye method int return type ka hai aur ek parameter 'a' leta hai
    public static int rahul(int a) {

        // Ye line har baar print hogi jab method call hoga
        System.out.println("Rahul");

        // Condition check kar rahe hain
        // Agar 'a' positive hai to 5 return karega
        if (a > 0) return 5;

            // Agar 'a' 0 ya negative hai to 0 return karega
        else return 0;
    }

    public static void main(String[] args) {

        // rahul(5) method call ho raha hai
        // a = 5 (positive hai), isliye return value = 5
        int x = rahul(5);

        // 7 + x (x = 5), to final output = 12
        System.out.println(7 + x);
    }
}