package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set1{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        System.out.println(l1);

        System.out.println(l1.get(0));


        HashSet<Integer> set1 = new HashSet<>(l1);
        System.out.println(set1);

        ArrayList<Integer> arr = new ArrayList<>(l1);
        System.out.println(arr);
        System.out.println( arr.get(1));

//        Iterator<Integer> it = set1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


//        *HOME WORK
//        Scanner -> create login(3 users) -> save in HashSet -> find short login -> message have to do long login
    }
}
