package OOP;

// Constructor allows you to pass values at the point of initialization for your object.
public class Constructors {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Star", 5);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        
        System.out.println();
        Dog puppy = new Dog("Puppy:)");
        System.out.println(puppy.getAge()); // by default the age is zero
        System.out.println(puppy.getName());
        
    }
}

class Dog {
    private String name;
    private int age;

    // Constructor with 0 argument
    public Dog(){
        // Empty Constructor
    }
    // Constructor with 2 argument
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Constructor with 1 argument
    public Dog(String name) {
        this.name = name;
        // this.age = ;
    }

    // Don't need to create setName method because of initialize constructor.
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}