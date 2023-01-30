package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

    public static void main(String[] args) {
        Set<Integer> sett = new HashSet<>();
        sett.add(1);
        sett.add(4);
        sett.add(5);
//        System.out.println(sett);

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(sett);
        set2.add(2);
        set2.add(3);
//        System.out.println(set2);

//        for(int i: set2){
//            System.out.print(i + ",");
//        }

//        boolean del = set2.remove(2);
//        System.out.println(del);
//        System.out.println(set2);

//        set2.retainAll(sett);
//        System.out.println(set2);



        TreeSet<String> numbers = new TreeSet<>();
        numbers.add("two");
        numbers.add("One");
        numbers.add("Three");
        System.out.println(numbers);

        Iterator<String> iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
