package codingBat.array2;

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {
        int [] n = {0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(zeroFront(n)));
    }

    public static int[] zeroFront(int[] nums) {
        if (nums == null) {
            return nums;
        }

        int zeroesPos = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                nums[i] = nums[zeroesPos];  // move the non-zero number to position i
                nums[zeroesPos] = 0;  // move the zero toward the front
                ++zeroesPos;
            }
        }
        return nums;
    }
}
