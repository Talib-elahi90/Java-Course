// Inheritance allows us to create a new class from an existing class. 

package OOP;

import java.util.Objects;

// Inheritance
public class Inheritance {
    public static void main(String[] args) {
        String[] programmingLanguages = {"Java", "Python", "C++"};

        Programmer programmer = new Programmer("Shah", 25, "Karachi", "FullStack",programmingLanguages);
        System.out.println(programmer);
    }
}

class Employee {
    private String name;
    private int age;
    private String address;
    private String experience;

    public Employee(String name, int age, String address, String experience) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.experience = experience;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", experience=" + experience + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, experience);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null && getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (experience == null) {
            if (other.experience != null)
                return false;
        } else if (!experience.equals(other.experience))
            return false;
        return true;
    }

}

class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        // Super keyword means we call the mthods or members from the parent class and also invoke the constructor from the super class.
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writingCode() {
        System.out.println("Write some code.");
    }
}

class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public void report() {
        System.out.println("Manager Writing Team Report.");
    }

}