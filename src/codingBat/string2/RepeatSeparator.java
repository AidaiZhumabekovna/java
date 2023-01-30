package codingBat.string2;

public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String s  = "";
        int i = 0;
        while(i < count){
            if(i < count -1){
                s+= word+sep;
            }else{
                s += word;
            }
            i++;
        }
        return s;
    }
}
