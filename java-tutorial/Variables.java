// variable is the basic unit of storage in a Java program.
public class Variables {

    public static void main(String[] args) {
        int a, b, c; // declares three ints, a, b, and c.
        int d = 3, e, f = 5; // declares three more ints, initializing
                             // d and f.
        byte z = 22; // initializes z.
        double pi = 3.14159; // declares an approximation of pi.
        char x = 'x'; // the variable x has the value 'x'.

        // Dynamic Initialization
        // computes the length of the hypotenuse of a right triangle
        double i = 3.0, j = 5.0;
        // k is dynamically initialized
        double k = Math.sqrt(i * i + j * j);
        System.out.println("hypotenuse is: " + k);

        // Scope of Variables
        int l;              // known to all code within main
        l = 10;
        if (l == 10) {      // start new scope
            int y = 20;     // known only to this block
            // x and y both known here.
            System.out.println("x and y: " + l + " " + y);
            l = y * 2;
        }
        // y = 100; // Error! y not known here
        // x is still known here.
        System.out.println("l is " + l);
    }
}