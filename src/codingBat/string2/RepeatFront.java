package codingBat.string2;

public class RepeatFront {

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 3));
    }

    public static String repeatFront(String str, int n) {
        String res = "";
        for(; n>=0; n--){
            res+=str.substring(0, n);
        }
        return res;
    }
}
