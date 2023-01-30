package codingBat.logic2;

public class EvenlySpaced {

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2,4,9));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        return ((a+b) == 2*c) || ((a+c) == 2*b) || ((b+c) == 2*a);
    }



}
