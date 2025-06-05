package OOP;

// Abstract class cannot be instantiated.
// Abstract method have no body.
// Avoid code duplication, and increase reusability. 
import java.util.Objects;

public class AbstractKeyword {
    public static void main(String[] args) {
        Snake snake = new Snake("snicky");
        Animals parrot = new Bird("parrot");

        snake.makeSound();
        parrot.makeSound();
    }
}

// This class cannot be instantiated, it use with an inheritance.
abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animals other = (Animals) obj;
        return Objects.equals(name, other.name);
    }

}

class Snake extends Animals {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("yss ysse");
    }

}

class Bird extends Animals {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("auaaan");
    }

}