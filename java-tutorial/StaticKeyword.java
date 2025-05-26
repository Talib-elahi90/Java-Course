// Static means it belongs to the class itself rather then the instances.
public class StaticKeyword {
    static int a = 4;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static Block");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(35);
        System.out.println();
        System.out.print("With class name: ");
        useStatic.meth(50);
    }
}

class useStatic {
    static int a = 4;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static Block");
        b = a * 4;
    }
}