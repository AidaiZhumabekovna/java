package codingBat.ap1;

public class DevidesSelf {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(dividesSelf(n));
    }
    public static boolean dividesSelf(int n) {
        int x = n;
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            if (n == 0 && n % digit != 1) {
                return false;

        }
        }
        return true;
    }
}
