package oop.principsOOP.interface1.interfaceMethodPrivate;

public interface Calculatable {
    //Приватные методы. Они могут быть статическими и нестатическими,
    // но они не могут иметь реализации по умолчанию.

    //Подобные методы могут использоваться только внутри самого интерфейса,
    // в котором они определены. То есть к примеру нам надо выполнять в
    // интерфейсе некоторые повторяющиеся действия,
    // и в этом случае такие действия можно выделить в приватные методы:

//    default int sum(int a, int b){
//        //return sumAll(a,b);
//    }

//    default int sum(int a, int b, int c){
//        return sumAll(a,b,c);
//    }


    //private int sumAll(int .... values){
    // int res =0;
    //for(int i : values){
    // res += n;
    //  }
    // return res;
}
