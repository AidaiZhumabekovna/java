package oop.principsOOP.interface1.interface2;

public interface Fly {

    //interface is like a class, which contains constants and abstract method

    //  in interface we can create abstract,default, static , private method and we can override only
    // default method

    // except access modifies have optional access modifies: static, abstract, final
    //default access modifies uses only in interface
    String fly();

    default String fly2(){
        return "Fly fly";
    }

    static String fly3(){  // we can call by class name in main class
        return "Ak buluuut";
    }


    //in new version private method is work, we use when we do repetitive actions
    // сам private method forbidden call in another class, we can call only inside current class's method
//    private String fly4(){
//        return "Hello";
//    }
}
