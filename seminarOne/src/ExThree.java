import java.util.Arrays;

public class ExThree {
    /* Дан массив nums = [3,2,5,3] и число val = 3
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.*/
    public static int[] exThree(){
        int[] nums = {3, 2, 5, 3, 4};
        int[] newNums = new int[nums.length];
        int val = 3;
        Arrays.fill(newNums, val);

        for (int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != val){
                newNums[j] = nums[i];
                j++;
            }
        }

        return newNums;
    }
}
