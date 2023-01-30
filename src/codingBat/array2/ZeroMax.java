package codingBat.array2;

public class ZeroMax {
    public static void main(String[] args) {
     int [] n = {0, 5, 0, 3};
        System.out.println(zeroMax(n));
    }

    public static int[] zeroMax(int[] nums) {
        int replace = 0; // Stores previous largest odd - default to 0 to avoid replacement

        for (int i = nums.length - 1; i >= 0; i--) { // start from end
            final int next = nums[i];
            if (next == 0) { // If we should replace
                nums[i] = replace;
            } else if (next % 2 == 1 && next > replace) {
                // If we have an odd number that is larger than the replacement
                replace = next;
            }
        }
        return nums;
    }


    public static int[] zeroToMaxNum(int [] nums){
        int replace = 0;
        for (int i = 0; i < nums.length-1; i++) {
            final int next = nums[i];
            if(next == 0){
                nums[i] = replace;
            }else if(next % 2  == 1 && next >   replace){
                replace = next;
            }
        }
        return nums;
    }

}
