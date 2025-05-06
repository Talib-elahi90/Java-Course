import java.util.*;

// Enums allows us to make constants in java
public class Enums {
    // This is our constants
    enum Gender {
        MALE,
        FEMALE
    }

    enum ShoeSize {
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        ELEVEN,
        TWELVE
    }

    public static void main(String[] args) {
        // enum

        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);

        // OR

        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;

        // Convert an enum to String
        System.out.println("Enum to String " + Gender.valueOf("FEMALE"));

        // Loop 
        System.out.println("Shoe Size Loop ");
        for(ShoeSize shoe: ShoeSize.values()){
            System.out.println(shoe);
        }
        System.out.println();

        System.out.println(male);
        System.out.println(female);
        // Output
        // MALE
        // FEMALE

    }
}
