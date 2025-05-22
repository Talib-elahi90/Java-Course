package OOP;

/* it is possible to define two or more methods within the same class that share the
same name, as long as their parameter declarations are different. When this is the case,
the methods are said to be overloaded, and the process is referred to as method overloading. */
public class Overloading {
    void demo() {
        System.out.println("No paremeters");
    }
    void test(int a) {
        System.out.println("a :" + a);
    }
    void test(int a, int b) {
        System.out.println(" a and b:" + a + " " + b);
    }
    double test(double d) {
        System.out.println("double :" + d);
        return d;
    }
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        o1.test(5);
        o1.test(5, 2);
        o1.test(55.5);
        o1.demo();
    }
    
}
