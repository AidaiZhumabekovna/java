package codingBat.ap1;

public class HasOne {
    public static void main(String[] args) {
        System.out.println(hasOne(211112));
    }
    public static boolean hasOne(int n) {
        while(n != 0) {
            if(n % 10 == 1)
                return true;

            n /= 10;
        }

        return false;
    }

}
