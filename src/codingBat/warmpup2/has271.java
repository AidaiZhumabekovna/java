package codingBat.warmpup2;

public class has271 {
    public static void main(String[] args) {
//        int []nn = {1, 2, 7, 1};
//        has271(nn);

        System.out.println(everyNth("abcdefg",2));
    }

    public static boolean has271(int[] nums) {
        for(int i = 0; i < nums.length-2; i++){
            int val = nums[i];
            if(nums[i+1] == (val+5) && Math.abs(nums[i+2] - (val-1)) <= 2){
                return true;
            }
        }
        return false;
    }

    public static String everyNth(String str, int n) {
        String s = "";
        for(int i = 0; i<str.length(); i=i+n){
            s = s + str.charAt(i);
        }
        return s;
    }

}
