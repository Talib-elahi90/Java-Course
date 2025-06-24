package AdvanceTopics;

public class GenericsMethods {
    public static void main(String[] args) {
        String[] names = {"Ali", "Alian", "Ashu"};
        Character[] alpha = {'A', 'B', 'C'};
        Integer[] nums = {1, 2, 3, 4, 5};

        print(names);
        print(alpha);
        print(nums);
    }

    static <T> void print(T[] arr) {
        for (T a : arr) {
            System.out.println(a.getClass().getName() +
                    " - " + a);
        }
    }
}
