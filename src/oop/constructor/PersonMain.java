package oop.constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person object = new Person("john", "dou", 12, 1.78, 'm', "+132332323");
        object.name = "Aidai";
        object.name = "Aidai";
        System.out.println("this is: " +object);

        object.work();
        object.work();
        System.out.println(object);
    }
}
