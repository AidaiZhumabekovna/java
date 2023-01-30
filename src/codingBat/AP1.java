package codingBat;

import java.util.Arrays;

public class AP1 {
    public static void main(String[] args) {
        int [] ww = {5, 6, 45};
//        String [] www = {"aa", "bb", "cc", ""};
//
//        System.out.println(matchUp(ww, www));

//        System.out.println(roundSum(4, 17, 18));
//
//
//        System.out.println(shiftLeft(ww));
//        System.out.println(sameEnds(ww, 3));
    }

    public static int matchUp(String[] a, String[] b){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            String temp1 = a[i];
            String temp2 = b[i];
            if (!temp1.equals("") && !temp2.equals("")){
                if (temp1.charAt(0) == temp2.charAt(0)){
                    count++;
                }
            }
        }

        return count;
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);

    }

    public static int round10(int n) {
        if(n % 10 < 5){
            return n - (n%10);
        }else{
            return n + (10 - (n%10));

        }
    }

//    public static boolean sameEnds(int[] nums, int len) {
//        for(int i = 0; i < len; i++) {
//            if(nums[i] != nums[nums.length - len + i])
//
//                return false;
//        }
//
//        return true;
//    }


    public static int[] shiftLeft(int[] nums) {
        int len = nums.length;
        int temp = 0;
        for(int i=0; i<len-1; i++){
            temp = nums[i];
            nums[i]= nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }


    //        int [] ww = {5, 6, 45};
}
