package OOP;

// A class is a blueprint for creating objects, and an object is an instance of a class.
public class ClassesAndObjects {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
    }

    static class Cat {
        String name;

        void meow() {
            System.out.println(name + ": meow...");
        }
    }
}
