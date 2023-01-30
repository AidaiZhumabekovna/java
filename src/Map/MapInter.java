package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInter {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);

        System.out.println("keys: " + numbers.keySet());
        System.out.println("values: " + numbers.values());
//        System.out.println("entries: " + numbers.entrySet());
        int st = numbers.remove("one");
        System.out.println("removed elem: " + st);
        System.out.println(numbers.entrySet());


//        ITERATE THROUGH KEYS
        for(String keey: numbers.keySet()){
            System.out.println(keey);
        }

//        ITERATE THROUGH VALUES
        for(int val : numbers.values()){
            System.out.println(val);
        }

        for(Map.Entry<String, Integer> both : numbers.entrySet()){
            System.out.print(both);
            System.out.print(",");
        }



        Map<String, Integer> str = new TreeMap<>(numbers);
        str.put("First", 1);
        str.put("Second", 2);
        str.put("Thirds", 3);


//        USING GET
        System.out.println("________________________________");
        int getValue = str.get("First");
        System.out.println(getValue  + "<=");
        System.out.println(str.keySet());
        System.out.println(str.values());

        String[] arr = {"salt", "tea", "soda", "toast"};

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if()
        }


    }
}
