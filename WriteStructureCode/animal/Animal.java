package WriteStructureCode.animal;

import java.util.Objects;

public class Animal {
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
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return age == animal.age && Objects.equals(name, animal.name);
    }

}
