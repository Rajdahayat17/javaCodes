package Methods;

public class builtIn {

    public static void main(String[] args){

        // Math class ke built-in methods ka use kar rahe hain
        // Ye methods already Java me defined hote hain (import ki zarurat nahi padti)

        // Square root nikalta hai (√value)
        System.out.println(Math.sqrt(9.8));

        // Cube root nikalta hai (∛value)
        System.out.println(Math.cbrt(100));

        // Floor: value se chhota ya equal nearest integer deta hai
        // Note: negative numbers me aur chhota (left side) jata hai
        System.out.println(Math.floor(-7.8));  // output: -8.0

        // Ceil: value se bada ya equal nearest integer deta hai
        System.out.println(Math.ceil(3.002));  // output: 4.0

        // Do numbers me se maximum (bada) value deta hai
        System.out.println(Math.max(2.3, 2.5));

        // Do numbers me se minimum (chhota) value deta hai
        System.out.println(Math.min(2.3, 2.5));

    }
}