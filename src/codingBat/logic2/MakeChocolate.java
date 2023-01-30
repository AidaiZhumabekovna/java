package codingBat.logic2;

public class MakeChocolate {
    public static void main(String[] args) {

//        System.out.println(make_chocolate(4,1,9));
        System.out.println(make(4,1,9));
    }




    public static int make(int small, int big, int goal){
        int needed_small = goal - Math.min((int) Math.floor(goal / 5), big) * 5;
        return needed_small <= small ? needed_small : -1;
    }





//    public static int make_chocolate(int small, int big, int goal){
//        int remainder;
//        if(goal >= 5 * big){
//            remainder = goal - 5 * big;
//        }else {
//            remainder = goal % 5;
//        }
//        if (remainder <= small){
//            return remainder;
//        }
//        return  -1;
//    }

//
//     while big * 5 > goal:
//    big -= 1
//            if (goal - (big * 5)) <= small:
//            return goal - (big * 5)
//            else:
//            return -1



//    public static  int makeCh(int small, int big, int goal){
//        int fBig = big * 5;  // 1 big == 5 > 1 * 5
//       while (fBig > goal){  // 5 > 9
//           big -= 1;
//
//       }
//       if (goal - fBig <= small){
//           return  goal - fBig;
//       }else {
//           return -1;
//       }
//
//    }



//    def make_chocolate(small, big, goal):
//    noOfBigs = big if(5 * big <= goal) else goal / 5
//            return  goal - (noOfBigs * 5)  if small >= (goal - (noOfBigs * 5)) else -1


//    big *= 5;
//    if (big + small < goal || small < goal%5)
//            return -1;
//    small = goal - big;
//    return small < 0 ? (big+small)%5 : small;




//    def make_chocolate(small, big, goal):
//            if goal >= 5 * big:
//    remainder = goal - 5 * big
//    else:
//    remainder = goal % 5
//
//            if remainder <= small:
//            return remainder
//
//    return -1
}
