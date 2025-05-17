package OOP;

public class Cat {
    // If you want to access it in a main class you must add get and set methods.
    private String name; // field

    void meow() { // method or behavoir
        System.out.println(name + ": meow...");
    }

    // This setter allows us to set correspondence value.
    public void setName(String name) {
        // this keyword is used to access current instance object of the class.
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
