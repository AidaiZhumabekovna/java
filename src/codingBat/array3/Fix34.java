package codingBat.array3;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {

        int [] arr = {1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(arr)));

    }

    public static int[] fix34(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                int temp = nums[i+1];
                nums[i+1] = 4;
                for(int j = i+2; j < nums.length; j++){
                    if(nums[j] == 4){
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

}
