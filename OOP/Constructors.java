package OOP;

// Constructor allows you to pass values at the point of initialization for your object.
public class Constructors {

    public static void main(String[] args) {
        // Dog dog = new Dog("Star", 5);
        // System.out.println(dog.getAge());
        // System.out.println(dog.getName());

        // System.out.println();
        // Dog puppy = new Dog("Puppy:)");
        // System.out.println(puppy.getAge()); // by default the age is zero
        // System.out.println(puppy.getName());

        // If you want to print only object
        Dog dog = new Dog("Star", 5, "white");
        Dog puppy = new Dog("Puppy:)");
        System.out.println(dog.getColor());
        System.out.println(dog);
        System.out.println(puppy.getAge());
        System.out.println(puppy);
        // Output 
        // OOP.Dog@251a69d7
        // OOP.Dog@7344699f
        // So add toString method in the class ->
    }
}

class Dog {
    private String name;
    private int age;
    private String color;

    // Constructor with 0 argument
    public Dog() {
        // Empty Constructor
    }

    // Constructor with 2 argument
    public Dog(String name, int age, String color) {
        this(name, age); // this is to access 2 args constructor.
        this.color = color;
    }

    // Constructor with 1 argument
    public Dog(String name) {
        this.name = name;
        // By default the age is zero
    }

    // Constructor with 3 argument
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Don't need to create setName method because of initialize constructor.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Add toString to print objects.
    public String toString() {
        return "Name: " + name + ", Age: " + age + " Color: " + color;
    }
}