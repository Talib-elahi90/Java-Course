package OOP;

import java.util.Objects;

// allows a subclass to provide a specific implementation for a method that is already defined in its superclass.

public class Overriding {

    public static void main(String[] args) {
        Animal a1 = new Animal("Donkey", 6);
        Animal a2 = new Animal("Donkey", 6);
        System.out.println(a1 == a2); // Compare reference
        // System.out.println(a1.equals(a2)); // both compare references, let's fix it for comparing object values.
        
        // After fix it
        System.out.println(a1.equals(a2)); 
        
    }
}

class Animal {
    private String name;
    private int age;

    Animal() {

    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override from a super class i.e Object class.
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Override from a super class i.e Object class.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    
}
