package bubbleSorting;


//we put breakpoint, where must stop, when i run debug it will come to this
//внешний цикл не работает пока внутренний цикл не закончится
//
//
//
//
//
//
public class SortingWithFor {
    public static void main(String[] args) {
//        String s = "fdsd";
//        s.startsWith(i)
//        String arr [][] = {{"6","3","5"}, {"6","3","5"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//
//                if ()
//            }
//        }
//        BubbleSorting(arr);
    }

    public static void BubbleSorting(int [] arr){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])  // если здесь условия тру ь
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }


}
