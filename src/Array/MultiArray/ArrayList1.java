package Array.MultiArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

//           generic - net tip
        ArrayList list1 = new ArrayList();
        list1.add(243);
        list1.add("hi");
        list1.add('3');
        list1.add(true);
        list1.add(243);

//        non generic

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("a");
        list2.add("d");
        list2.add("c");
        list2.add("c");
        list2.add("c");
//        list2.add(2, "e");
//        list2.remove("a");   // remove object it works here


        //            indexOf(), lastIndexOf
        System.out.println(list2.indexOf("a"));
        System.out.println(list2.lastIndexOf("c"));
        System.out.println(list2.size()-2);

//        for (String i : list2){
//           i.indexOf("c", 4);
//            System.out.println(i);
//        }




//        remove
//        System.out.println(list2.size());
//        list2.remove(list2.size()-1);  // size of array 5 - 1 = 4 (d)
//        System.out.println(list2);

//        contains - boolean
//        System.out.println(list2.contains("a"));
//
////         isEmpty()
//        System.out.println(list2.isEmpty());
//
////           set()
//        list2.set(0,"x");  //to change
//        System.out.println(list2);
//
////            Collections.sort()
//        Collections.sort(list2);
//        System.out.println(list2);
//



//
//        ArrayList <Integer> nums = new ArrayList<>();
//        nums.add(4);
//        nums.add(5);
//        nums.add(3);
//        nums.add(7);

//        nums.remove(0);
//        nums.remove(5); // does not work
//        System.out.println(nums.size());
//        System.out.println(nums);


//      Convert Integer to List

        Integer nums [] = {23,45,56,76};

        List<Integer>  listNums = new ArrayList<>(Arrays.asList(nums));
        System.out.println(listNums);

    }

}
