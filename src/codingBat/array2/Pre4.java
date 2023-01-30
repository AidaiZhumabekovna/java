package codingBat.array2;

import java.util.Arrays;

public class Pre4 {
    public static void main(String[] args) {
        int [] n = {1, 2, 4, 1};
        System.out.println(Arrays.toString(pre4(n)));
    }
    public static int[] pre4(int[] nums) {
        int i = 0;

        while(nums[i] != 4)
            i++;

        int[] arr = new int[i];

        for(int j = 0; j < i; j++)
            arr[j] = nums[j];

        return arr;
    }
}
