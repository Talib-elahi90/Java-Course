// The two types are compatible.
// The destination type is larger than the source type.
public class TypeCasting {

    public static void main(String[] args) {
        // Casting Incompatible Types
        // if you want to assign an int value to a byte variable. This conversion will
        // not be performed automatically, because a byte is smaller than an int.
        /*
         * int a;
         * byte b;
         * // …
         * b = (byte) a; //Error
         */

        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

        // Output
        // Conversion of int to byte.
        // i and b 257 1
        // Conversion of double to int.
        // d and i 323.142 323
        // Conversion of double to byte.
        // d and b 323.142 67


        // The Type Promotion Rules
        byte e = 42;
        char c = 'a';
        short s = 1024;
        int j = 50000;
        float f = 5.67f;
        double x = .1234;
        double result = (f * e) + (j / c) - (x * s);
        System.out.println((f * e) + " + " + (j / c) + " - " + (x * s));
        System.out.println("result = " + result);
    }
}