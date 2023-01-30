package codingBat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        String [] str = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(firstSwap(str)));
    }


    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String s = strings[i];
            String first = s.substring(0,1);

            if(!map.containsKey(first))
                map.put(first, i);

            else if(map.get(first) >= 0){
                int lastSeen = map.get(first);
                strings[i] = strings [lastSeen];
                strings[lastSeen] = s;
                map.put(first, -1);
            }
        }
        return strings;
    }
}

