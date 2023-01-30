package codingBat.array2;

public class tenRun1 {
    public static void main(String[] args) {
        int [] n = {2, 4, 10, 4, 20, 5};
        System.out.println(tenRun(n));
    }
    public static int[] tenRun(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 10 == 0) {
                if (nums[i+1] % 10 != 0) {
                    nums[i+1] = nums[i];
                }
            }
        }
        return nums;
    }
}
