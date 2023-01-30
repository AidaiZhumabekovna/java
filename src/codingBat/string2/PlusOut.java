package codingBat.string2;

public class PlusOut {

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
    }

    public static String plusOut(String str, String word) {
        String temp = str.replace(word, "+");
        String newS = "";

        for(int i = 0; i<temp.length(); i++){
            if(temp.charAt(i) == '+'){
                newS += word;
            }else{
                newS += "+";
            }
        }
        return newS;
    }
}
