package OOP;

import java.util.Arrays;
import java.util.Objects;

public class SimpleExOfOOP {
    public static void main(String[] args) {
        Dog puppyDog = new Dog("PuppyDog", 3, "White");
        Dog shippu = new Dog("Shippu", 1, "White");
        
        Dog[] dogs = {puppyDog, shippu};
        Person ali = new Person("Ali", "Ahmed", Gender.MALE, dogs);
        System.out.println(ali);
    }
}

class Person {
    private String firstname;
    private String lastname;
    private Gender gender;
    private Dog[] dogs;

    public Person(String firstname, String lastname, Gender gender, Dog[] dogs) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dogs = dogs;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public Dog[] getCats() {
        return dogs;
    }

    @Override
    public String toString() {
        return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", dogs="
                + Arrays.toString(dogs) + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, dogs);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        } else if (!firstname.equals(other.firstname))
            return false;
        if (lastname == null) {
            if (other.lastname != null)
                return false;
        } else if (!lastname.equals(other.lastname))
            return false;
        if (gender != other.gender)
            return false;
        if (!Arrays.equals(dogs, other.dogs))
            return false;
        return true;
    }

}

enum Gender {
    MALE,
    FEMALE
}

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

}