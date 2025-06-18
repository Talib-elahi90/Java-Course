// Sets: No duplicate
// HashSet: Order is not guarantee

import java.util.HashSet;
import java.util.Set;

public class UseSets {
    public static void main(String[] args) {
        Set<String> bats = new HashSet<>();
        bats.add("AK");
        bats.add("AK"); //rejects
        bats.add("CA");
        bats.add("ReBook");
        bats.forEach(System.out::println);
        System.out.println(bats.size());
    }
}
