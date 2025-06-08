import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = { 2, 5, 6, 8, 9, -1, 7, -3 };
        int target = 17;

        System.out.println(Arrays.toString(twoNumberSum(array, target)));
    }
    // Time O(N^2), Space (1)
    // private static int[] twoNumberSum(int[] array, int target) {
    // for (int i = 0; i < array.length - 1; i++) {
    // int firstNumber = array[i];
    // for (int j = i + 1; j < array.length; j++) {
    // int secontNumber = array[j];
    // if (firstNumber + secontNumber == target) {
    // return new int[] { firstNumber, secontNumber };
    // }
    // }
    // }
    // return new int[] {};
    // }

    // O(NlogN) | Space O(1)
    private static int[] twoNumberSum(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;
        Arrays.sort(array);
        while (l < r) {
            int currentSum = array[l] + array[r];
            if (currentSum == target) {
                return new int[] { array[l], array[r] };
            } else if (currentSum < target) {
                l++;
            } else
                r++;
        }
        return new int[] {};
    }

    // Time O(N), Space O(N)
    // private static int[] twoNumberSum(int[] array, int target) {
    // List nums = new ArrayList<>();
    // for (int i = 0; i < array.length; i++) {
    // int match = target - array[i];
    // if (nums.contains(match)) {
    // return new int[] { match, array[i] };
    // } else {
    // nums.add(array[i]);
    // }
    // }
    // return new int[] {};
    // }

}