package AdvanceTopics;

public class Generics {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("One Plus."));
        System.out.println(box.get());
        
        Box<Letter> letter = new Box<>();
        letter.set(new Letter("Talib Ilahi"));
        System.out.println(letter.get());

    }
}

// Create Generic class, if you want to replace T with any alphabet, you could.
// It also many of these arguments <T, K, V, M>
class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

class Phone {
    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + "]";
    }

}

class Letter {
    private final String letter;

    public Letter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Letter [letter=" + letter + "]";
    }

}