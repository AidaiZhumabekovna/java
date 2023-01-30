package codingBat.array2;

public class Sum67 {
    public static void main(String[] args) {
        int [] num = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(num));
    }


    public static int sum67(int[] nums) {
        int s =0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 6){
                while(nums[i] != 7){
                    i++;
                }
            }else{
                s+= nums[i];
            }
        }
        return s;
    }

}
