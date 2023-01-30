package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) throws Exception {
        //with help of values get keys





        //-----------------------------------------------
//
//        public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
//            HashMap<String, String> copy = new HashMap<String, String>(map);//массив копируется, так
//            //как в текущем массиве нельзя удалять - нарушается его целстность и цикл не правильно работает
//            for (Map.Entry<String, String> pair : copy.entrySet()) {//перебирает все значения в массиве
//                if (pair.getValue().equals(value))//если значение Value в массиве copy равно переданному
//                    //значению в начале метода
//                    map.remove(pair.getKey());//то удаляет запись в другом массиве map по ключу,
//                //так как ключ уникален в данном массиве (ключом выступает LastName)
//            }
//        }
//        String values = "Abdul";
//
//        HashMap<String, String> copy = new HashMap<>(fullName);
//        for(Map.Entry<String, String> pair: copy.entrySet()){
//            if(pair.getValue().equals(values)){
//                fullName.remove(pair.getKey());
//                System.out.println(fullName);
//            }
//        }
//        System.out.println(copy);

        //---------------------------------------------
//
//        Map<String, String> a = fullName;
//        removeTheFirstNameDuplicates(a);
//        System.out.println(a);
//    }
//
//    public static <K, V> void removeTheFirstNameDuplicates(Map<K, V> map) throws Exception {
//        Map<K, V> tmp = new HashMap<K, V>();
//        for (Iterator<K> it = map.keySet().iterator(); it.hasNext();) {
//            K key = it.next();
//            V val = map.get(key);
//            if (!tmp.containsValue(val)) {
//                tmp.put(key, val);
//            }
//        }
//        map.clear();
//        for (Iterator<K> it = tmp.keySet().iterator(); it.hasNext();) {
//            K key = it.next();
//            map.put((K) tmp.get(key), (V) key);
//        }
//// }


        // home work
//        Map<String, String> fullName = new HashMap<>();
//        fullName.put("Aidai", "Kur");
//        fullName.put("Ali", "Abdul");
//        fullName.put("ALbi", "Abdul");
//        System.out.println("values are: " + fullName.values());
//
//        System.out.println(removeDub(fullName));

//
//        if(tem1 != null && tem2 != null && tem1.equals(tem2)){
//            map.remove("a");
//            map.remove("b");
//        }
//        return map;


        HashMap<String, String> names = new HashMap<>();
        names.put("Belek", "Baratov");
        names.put("Azat", "Maksatov");
        names.put("Mirbek", "Atabekov");
        names.put("Nurlan", "Nasip");
        names.put("Gulnur", "Satylganova");
        names.put("Nuta", "Bema");
        names.put("Ali", "Baratov");
        for (String str : duplicate(names).keySet()){
            System.out.println(str + " = " + names.get(str));
        }
    }
    public static HashMap<String,String> duplicate (HashMap<String, String> name){
        ArrayList<String> keys = new ArrayList<>();
        HashMap<String,String> result = new HashMap<>(name);
        for (String key : name.keySet()){
            result.remove(key);
            for (String i : result.keySet()){
                if (name.get(key).equals(result.get(i))){
                    keys.add(key);
                    keys.add(i);
                }
            }
        }
        for (String key : keys){
            name.remove(key);
        }
        return name;
    }

}
