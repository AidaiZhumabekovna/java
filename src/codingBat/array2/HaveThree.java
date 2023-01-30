package codingBat.array2;

public class HaveThree {
    public static void main(String[] args) {
        int [] n = {3, 1, 3, 1, 3};
        System.out.println(haveThree(n));
    }
    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] == 3 ) {
                count++;
                i++;
            }
        }
        return count == 3;
    }
}
