package Arrays;

import java.util.ArrayList;

public class Array_list_DataTypes {

    public static void main(String[] args) {

        /*
         * ArrayList:
         * ArrayList is a dynamic array in Java.
         * Size automatically increase/decrease ho jata hai.
         * Generic syntax:
         * ArrayList<DataType> variableName = new ArrayList<>();
         */



        // ================= INTEGER TYPE =================
        // Integer wrapper class int value store karti hai
        ArrayList<Integer> intList = new ArrayList<>();

        // add() method element insert karta hai
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("Integer List : " + intList);



        // ================= DOUBLE TYPE =================
        // Decimal values store karne ke liye
        ArrayList<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5);
        doubleList.add(20.75);
        doubleList.add(30.99);

        System.out.println("Double List : " + doubleList);



        // ================= STRING TYPE =================
        // Text/String values store karne ke liye
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Raj");
        stringList.add("Java");
        stringList.add("Spring Boot");

        System.out.println("String List : " + stringList);



        // ================= LONG TYPE =================
        // Large integer values store karne ke liye
        ArrayList<Long> longList = new ArrayList<>();

        longList.add(1234567890L);
        longList.add(9876543210L);

        System.out.println("Long List : " + longList);



        // ================= FLOAT TYPE =================
        // Decimal values with less precision
        ArrayList<Float> floatList = new ArrayList<>();

        floatList.add(12.5f);
        floatList.add(45.8f);

        System.out.println("Float List : " + floatList);



        // ================= CHARACTER TYPE =================
        // Single character store karne ke liye
        ArrayList<Character> charList = new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('C');

        System.out.println("Character List : " + charList);



        // ================= BOOLEAN TYPE =================
        // true/false values store karne ke liye
        ArrayList<Boolean> boolList = new ArrayList<>();

        boolList.add(true);
        boolList.add(false);
        boolList.add(true);

        System.out.println("Boolean List : " + boolList);



        // ================= SHORT TYPE =================
        // Small integer values
        ArrayList<Short> shortList = new ArrayList<>();

        shortList.add((short) 100);
        shortList.add((short) 200);

        System.out.println("Short List : " + shortList);



        // ================= BYTE TYPE =================
        // Very small integer values
        ArrayList<Byte> byteList = new ArrayList<>();

        byteList.add((byte) 10);
        byteList.add((byte) 20);

        System.out.println("Byte List : " + byteList);



        /*
         * IMPORTANT NOTE:
         *
         * ArrayList primitive data types directly store nahi karta.
         * Primitive types:
         * int, double, float, char, boolean etc.
         *
         * Isliye wrapper classes use hoti hain:
         *
         * int      -> Integer
         * double   -> Double
         * float    -> Float
         * char     -> Character
         * boolean  -> Boolean
         * long     -> Long
         * short    -> Short
         * byte     -> Byte
         */

    }
}