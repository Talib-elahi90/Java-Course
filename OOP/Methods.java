package OOP;

public class Methods {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // display volume of first box
        mybox1.volume();

        // display volume of second box
        mybox2.volume();
        System.out.println();
    
        MethodWithParameter m1 = new MethodWithParameter();
        MethodWithParameter m2 = new MethodWithParameter();
        m1.setDim(5, 5, 5);
        System.out.println("MethodWithParameter " + m1.volume());

        m2.setDim(3, 4, 7);
        System.out.println("MethodWithParameter " + m2.volume());
    }
}

class Box {
    double width;
    double height;
    double depth;

    // Method that display volume of a box
    // type specifies the type of data returned by the method. This can be any valid
    // type, including class types that you create. If the method does not return a
    // value,
    // its return type must be void.
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // Returning a Value
    double return_volume() {
        return width * height * depth;
    }

}

class MethodWithParameter {
    double width;
    double height;
    double depth;

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * depth *height;
    }
}
