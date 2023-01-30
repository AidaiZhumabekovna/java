package codingBat.array2;

public class EvenOdd {
    public static void main(String[] args) {

        int [] n = {1, 0, 1, 0, 0, 1, 1};
        System.out.println(evenOdd(n));
    }

    public static int[] evenOdd(int[] nums) {
        int[] output = new int[nums.length];
        int evenPos = 0;
        int oddPos = nums.length-1;
        for (int i : nums) {
            if (i%2==0) {
                output[evenPos++]=i;
            } else {
                output[oddPos--]=i;
            }
        }

        return output;
    }
}
