package Methods;

public class ReturnIsMandatory {

    public static void main(String[] args) {

        // raj(4) method call hoga aur jo value return karega wo print hogi
        System.out.println(raj(4));
    }

    // Method ka return type 'int' hona chahiye
    // kyunki hum value return kar rahe hain
    public static int raj(int a) {

        // Agar a < 5 hai to a return karo
        if (a < 5) {
            return a;
        }

        // Agar condition false ho to -9 return karo
        return -9;
    }
}