package OOP;

// A class is a blueprint for creating objects, and an object is an instance of a class.
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Accessing directly to the property of the class is bad.
        // cat.name = "Hoho"; // like this is actually bad.
        Cat kitty = new Cat();
        kitty.setName("Kitty");
        System.out.println("getName: "+ kitty.getName());
        kitty.meow();
        
        Cat sunCat = new Cat();
        sunCat.setName("Sun");
        System.out.println("getName: "+ sunCat.getName());
        sunCat.meow();

    }

    /*
    This is not god create a new class different class in the same package.
    static class Cat {
    
    private String name; // field

    void meow() { // method or behavoir
        System.out.println(name + ": meow...");
    } */
}
