import java.util.Arrays;

public class BubbleSort {
    // private static void bubbleSort(int[] array){
    // for(int i = 0; i<array.length-1; i++) {
    // boolean swap = false;
    // for(int j = 0; j<array.length - i - 1; j++){
    // if(array[j] > array[j + 1]) {
    // int temp = array[j];
    // array[j] = array[j + 1];
    // array[j + 1] = temp;
    // swap = true;
    // }
    // }
    // if(!swap) break;
    // }
    // }

    private static void bubbleSort(int[] nums) {
        boolean swap = false;
        while (!swap) {
            swap = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swap = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 3, 7, 8, 1, 12, 2 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
