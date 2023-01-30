package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("Aidai", "Kurmanbekova");
        names.put("Albina", "Abdullaeva");
        names.put("Alina", "Abdullaeva");
        names.put("Burulai", "Narzieva");
        names.put("Nurperi", "Nogoibaeva");

        for (String str : dublicates(names).keySet()){
            System.out.println(str + " = " + names.get(str));
        }

    }

    public static HashMap<String, String> dublicates(HashMap<String, String> names){
        ArrayList<String> keys = new ArrayList<>();
        HashMap<String, String> result = new HashMap<>(names);
        for (String key: names.keySet()){ // getting keys
              result.remove(key);
              for (String i : result.keySet()){
                  if(names.get(key).equals(result.get(i))){
//                      keys.add(key);
//                      keys.add(i);
                  }
              }
        }

//        for (String key : keys){
//            names.remove(key);
//        }
        return names;
    }
}
