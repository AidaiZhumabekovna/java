import Interface.ProgrammingLan;
import Interface.Rectangles;
import Polimorfism.Overloading.Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        String s = "11";
//        int ii = Integer.parseInt(s);
//        System.out.println(ii);

        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        List<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);

//        for (Map.Entry<String, String> m: map.entrySet()) {
//            list.add(m.getValue());
//
//        }
//        System.out.println(list);



//        ENCAPSULATION
//        Person person = new Person();
//         person.setPassword("Aidai");
//        System.out.println(person.getPassword());



        //    POLIMORFISM

//        Square s1 = new Square();
//        s1.render();
//
//        Circle c1 = new Circle();
//        c1.render();



//        OVERRIDING

//        Javaa j1 = new Javaa();
//        j1.displayInfo();
//
//
//        Language l1 = new Language();
//        l1.displayInfo();


//        OVERLOADING

//        Pattern p = new Pattern();
//        p.display();
//
//        p.display('#');


//        INTERFACE

//        Rectangles r1 = new Rectangles();
//        r1.getArea(5,6);
//
//        r1.getName("JS");
//
//
//        ProgrammingLan p1 = new ProgrammingLan();
//        p1.getName("Java");

  }
}