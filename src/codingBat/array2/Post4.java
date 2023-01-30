package codingBat.array2;

import java.util.Arrays;

public class Post4 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 2};
        System.out.println(Arrays.toString(post4(arr)));
    }

    public static int[] post4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 4){
                index = i + 1;
            }
        }

        int [] res = new int[nums.length - index];
        for (int i = 0; i < nums.length - index; i++) {
            res[i] = nums[i + index];
        }
        return  res;
    }
}
