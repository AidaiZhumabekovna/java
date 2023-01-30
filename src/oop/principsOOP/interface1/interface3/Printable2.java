package oop.principsOOP.interface1.interface3;

public interface Printable2 {

    //Все методы интерфейса не имеют модификаторов доступа,
    // но фактически по умолчанию доступ public,
    // так как цель интерфейса - определение функционала для реализации его классом.
    // Поэтому весь функционал должен быть открыт для реализации.
    String print();  //abstract method

//    default String soundOfIphone(){
//        return "Dyrydyn"; //by default all iphones call sounds, but we can change this sounds to another music
//    }

    default String print2(){  // default method
        return read();
    }

    static String read(){  // static mehod cannot override
        return "read printable";
    }




}
