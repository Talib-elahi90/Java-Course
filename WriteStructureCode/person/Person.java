package WriteStructureCode.person;

import java.util.Arrays;
import java.util.Objects;

import WriteStructureCode.dog.Dog;

public class Person {
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
