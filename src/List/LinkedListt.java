package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
//        LinkedList<String> str = new LinkedList<>();
//        str.add("He");
//        str.add("She");
//        str.add("It");


//        System.out.println(str.getFirst());
//        System.out.println(str.getLast());
//        System.out.println(str.removeFirst());
//        System.out.println(str);
//        String first = str.peek();
//        System.out.println(first);

//        String firstAccessRemove = str.poll();
//        System.out.println(firstAccessRemove);

//        str.offer("Swift");
//        System.out.println(str);


//        ArrayList
        Integer nums [] = {23,54,67,45};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(list1);
        list1.add(97);
        System.out.println(list1);
        list1.add(0, 90);

        System.out.println(list1);
        System.out.println("______________________________");



//        LinkedList

        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(nums));
        System.out.println(list2);
        list2.add(999);
        System.out.println(list2);
        list2.addFirst(22);
        System.out.println(list2);
        list2.removeFirst();
        System.out.println(list2);
        list2.removeLast();
        System.out.println(list2);

    }
}
