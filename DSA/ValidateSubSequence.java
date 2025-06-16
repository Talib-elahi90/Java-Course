import java.util.*;

public class ValidateSubSequence {
    public static void main(String[] args) {
        // {8, 6, 7, 10, -1, 3, -10, 9, 11}
        // {7, -1, 8, 9}
        int[] array = { 8, 6, 7, -1, 3, -10, 9, 11 };
        int[] subArray = { 7, -1, -10, 9 };

        System.out.println(subSequence(array, subArray));

    }

    // Time O(N) | Space O(1)
    private static boolean subSequence(int[] array, int[] subArray) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.length && seqIdx < subArray.length) {
            if (array[arrIdx] == subArray[seqIdx]) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == subArray.length;
    }

    private static boolean subSequence1(int[] array, int[] subArray) {
        int seqIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (seqIdx < subArray.length) {
                return true;
            }
            if (array[i] == subArray[seqIdx]) {
                seqIdx++;
            }
        }
        return seqIdx == subArray.length;
    }
}
