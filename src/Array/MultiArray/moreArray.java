package Array.MultiArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class moreArray {

    public static void main(String[] args) {

//        enter all elements
//        int [][] a = {
//                {2,4,4},
//                {4,7,8},
//                {6,3,2}
//        };
//
//        for(int[] innerArray: a){
//            for(int data : innerArray){
//                System.out.println(data);
//            }
//        }



//        ACCESS TO THE MULTIARRAY
        int [][] a = {
                {2,4,4},
                {4,7,8},
                {6,3,2}
        };

        for(int[] innerArray: a){

            for(int data : innerArray){
//                System.out.println(data);
            }
        }



//        sum and average number
//        int [] a = {3,5,6,7};
//
//        int sum= 0;
//        Double average;
//
//        for(int i: a){
//            sum+=i;
//        }
//
//        int arrLength = a.length;
//        average = ((double) sum / (double) arrLength);
//        System.out.println("Sum:" + sum);
//        System.out.println("Average: " + average);



        Integer[][] array = {{2,3,5}, {7,8,1}};

        List<Integer[]> nn = new LinkedList<>(Arrays.asList(array));
//        System.out.println(Arrays.toString(nn));
        System.out.println(nn);
//        for(Integer[] s : nn){
////            System.out.println(Arrays.toString(s));
//            for(Integer ss : s){
//                System.out.println(ss);
//            }
//        }
        System.out.println();
    }
}
