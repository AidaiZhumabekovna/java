package codingBat.string2;

public class XYbalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("yxyxyxyx"));
    }

    public static boolean xyBalance(String str) {
        if(str.length() < 1 || str.indexOf('x') == -1){
            return true;
        }
        int lastX = str.lastIndexOf('x');
        if(lastX < str.length()-1){
            for(int i = lastX +1; i<str.length(); i++){
                if(str.charAt(i) == 'y'){
                    return true;
                }
            }
        }
        return false;
    }

}
