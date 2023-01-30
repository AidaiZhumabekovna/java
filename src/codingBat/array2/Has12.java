package codingBat.array2;

public class Has12 {
    public static void main(String[] args) {

        int [] n = {1, 3, 2};
        System.out.println(has12(n));
    }

    public static boolean has12(int[] nums) {
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                flag = true;
            }
            if(flag && nums[i]==2){
                return true;
            }
        }
        return false;
    }
}
