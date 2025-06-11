package OOP;
// Polymorphism means many forms. 

import java.util.Arrays;
import java.util.Objects;

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Byke byke = new Byke();

        Vehicle[] vehicles = {car, bicycle, byke};

        Person ali = new Person("Ali", vehicles);

        for (Vehicle vehicle : ali.getVehicles()) {
            vehicle.move(20);
            System.out.println("Vehicles Speed: " + vehicle.getCurrentSpeed());
        }

    }
}

class Person {
    private String name;
    private Vehicle[] vehicles;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", vehicles=" + Arrays.toString(vehicles) + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicles);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (!Arrays.equals(vehicles, other.vehicles))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

}
// Default abstract methods in interface with no body.
interface Vehicle {

    void applyBreak(int number);

    void move(int number);

    int getCurrentSpeed();
}

class Car implements Vehicle {
    private int currentSpeed;

    public Car() {

    }
    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBreak(int number) {
        this.currentSpeed -= number;
    }

    @Override
    public void move(int number) {
        System.out.println("Car is moving with speed increase of " + number);
        this.currentSpeed += number;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;

    }

}

class Bicycle implements Vehicle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBreak(int number) {
        this.currentSpeed -= number;
    }

    @Override
    public void move(int number) {
        System.out.println("Bicycle is moving with speed increase of " + number);
        this.currentSpeed += number;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

}

class Byke implements Vehicle {
    private int currentSpeed;

    public Byke() {
    }

    public Byke(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBreak(int number) {
        this.currentSpeed -= number;
    }

    @Override
    public void move(int number) {
        System.out.println("Byke is moving with speed increase of " + number);
        this.currentSpeed += number;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

}