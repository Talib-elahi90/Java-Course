import java.util.Arrays;

public class SelectionsSort {
    private static void selectionsSort(int[] array){
        for(int i = 0; i<array.length; i++) {
            int min_ind = i;
            for(int j = i+1; j<array.length; j++) {
                if(array[j] < array[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_ind];
            array[min_ind] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {32, 3, 5, 6, 7, 11, 4};
        selectionsSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
