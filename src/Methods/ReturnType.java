package Methods;

public class ReturnType {

    // Ye method 'int' return type ka hai (matlab ye ek integer value return karega)
    public static int Anshu() {

        // Ye statements sirf print ke liye hain (side effect)
        System.out.println("Anshu");
        System.out.println("Ramesh");

        // Method yaha se 5 return karega (return ke baad method end ho jata hai)
        return 5;
    }

    public static void main(String[] args) {

        // Anshu() method call ho raha hai
        // Ye pehle "Anshu" aur "Ramesh" print karega
        // Fir jo value return hogi (5), wo println ke through print hogi
        System.out.println(Anshu());
    }
}