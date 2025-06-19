import java.util.HashMap;
import java.util.Map;

public class UseMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ali");
        map.put(2, "Ben");
        map.put(3, "Mari");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.entrySet());

        for(Integer keys: map.keySet()) {
            System.out.println(keys);
        }

        for(String value: map.values()) {
            System.out.print(value+ " ");
        }

        System.out.println();
        map.entrySet().forEach(System.out::println);
    }
}
