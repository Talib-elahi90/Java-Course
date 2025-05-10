public class Operators {
    public static void main(String[] args) {
        /*
         * (+) Addition (also unary plus)
         * (–) Subtraction (also unary minus)
         * (*) Multiplication
         * (/) Division
         * (%) Modulus
         * (++) Increment
         * (+=) Addition assignment
         * (–=) Subtraction assignment
         * (*=) Multiplication assignment
         * (/=) Division assignment
         * (%=) Modulus assignment
         * (––) Decrement
         */

        // Arithmetic Operators
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        /*
         * When you run this program, you will see the following output:
         * Integer Arithmetic
         * a = 2
         * b = 6
         * c = 1
         * d = -1
         * e = 1
         * Floating Point Arithmetic
         * da = 2.0
         * db = 6.0
         */

        // Modulus Operator
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        // Assignment operators.
        int m = 1;
        int n = 2;
        int o = 3;
        m += 5;
        n *= 4;
        o += a * b;
        o %= 6;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);

        // Increment and Decrement
        x = x + 1; // can be rewritten like this by use of the increment operator:
        x++;

        // this statement:
        x = x - 1;
        // is equivalent to
        x--;

        int f = 1;
        int g = 2;
        int i;
        int j;
        i = ++m;
        j = n++;
        j++;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}