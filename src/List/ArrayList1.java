package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>();
//
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//
//        int numbers = nums.get(2);
//        System.out.println(nums);
//        System.out.println(numbers);


//
//        List<String> str = new ArrayList<>();
//         str.add("aa");
//         str.add("bb");
//         str.add("ccc");

//         str.replaceAll(n -> n + "*");
//         str.set(0, "y");
//         str.replaceAll(n -> "y" + n + "y");
//
//        System.out.println(str);


//        CONVERT ARRAYLIST INTO ARRAY

//        String[] arr = new String[str.size()];
//        str.toArray(arr);
//        System.out.println(arr);

//        for(String item : arr){
//            System.out.println(item);
//        }

//        CONVERT ARRAY INTO ARRAYLIST
      String[] arr1 = {"Java", "Python", "C++"};

        for(String st : arr1){
            System.out.println("Arrya: " + st);
        }

        ArrayList<String> lan = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(lan);
        lan.add(0, "C");
        System.out.println(lan);

        lan.set(1, "JS");
        System.out.println(lan);
        System.out.println(lan);


    }

}
