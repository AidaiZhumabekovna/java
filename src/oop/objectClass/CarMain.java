package oop.objectClass;

import java.lang.reflect.Array;
import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.color = "black";
        lexus.mark = "Lexus";
        lexus.yy = 2022;
        lexus.model = "ES";

        lexus.drive();
        lexus.brake();
        lexus.honk();

        Car audi = new Car();
        audi.color = "white";
        audi.mark = "audi";
        audi.yy = 2022;
        audi.model = "EE";

        audi.drive();
        audi.brake();
        audi.honk();

        ArrayList<Car> listOfCars = new ArrayList<>();
        listOfCars.add(lexus);
        listOfCars.add(audi);
        for(Car fruit:listOfCars) {
            System.out.println(listOfCars.toArray());
        }



//    Map<String, Integer> markAndYy = new HashMap<>();
//        markAndYy.put(lexus.mark, lexus.yy);
//        markAndYy.put(audi.mark, audi.yy);
//        System.out.println(markAndYy);


    }
}
