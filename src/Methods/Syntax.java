package Methods;

public class Syntax {

    public static void raj() {
        System.out.println("Dahayat");

    }
    public static void main(String[] args) { // sabse pahle Main function hi call hoga ye rule hai ise chahe kahi bhi define karey
        System.out.println("Rahul");
        raj(); //  call function  kar jo maine uper define kiya h wo  // it is function call
        // main Function me agr kisi define function call nhi kiya to function call nhi hoga

        abhi();
        jatin();

    }

    public static void abhi() {
        System.out.println("verma");

    }

    public static void jatin() {
        System.out.println("kushwaha");
        brajesh(); // function ke ander call karva  diye
        chetan();

    }
    public static void brajesh() {
        System.out.println("pathak");

    }

    public static void chetan() {
        System.out.println("shrivas");

    }

}
