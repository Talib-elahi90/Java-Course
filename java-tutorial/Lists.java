import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println(colors.contains("Blue"));
        System.out.println(colors.size());
        System.out.println(colors);
        System.out.println(colors.get(1));

        System.out.println("Inside foor loop");
        for (String color : colors) {
            System.out.print(color + " ");
        }

        // Immutable List
        List<Integer> unModifiable = List.of(
            1,2,3,4
        );
        System.out.println(unModifiable);
    }
}
