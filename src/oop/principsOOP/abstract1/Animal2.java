package oop.principsOOP.abstract1;


// Abstract method's has not body. We realize that method in another classes
 // In abstract class can have conventional method(обычный метод)
// Abstract method can overload and also override
// Abstract method might be created only in abstract class
// An object cannot be created by an abstract class - по абстрактному классу нельзя создавать объект
//

//Abstract class: is a restricted(ограниченный)  class that cannot be used to create objects
// (to access it, it must be inherited from another class).
//
//Abstract method: can only be used in an abstract class, and it does not have a body.
// The body is provided by the subclass (inherited from).

//To achieve security - hide certain details and only show the important details of an object.
//
//Note: Abstraction can also be achieved with Interfaces,

//Метод, объявленный с модификатором abstract в абстрактном классе и не имеющий реализации (то есть без тела), называется в java абстрактным методом . Он не содержит никакого тела.

// An abstract class is a class that is declared with an abstract keyword. ·
// An abstract method is a method that is declared without implementation.

public abstract class Animal2 {
    public String name;
    private int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public  String voice(){
//        return "hello";
//    }

    public abstract String voice();  // without params
//    public abstract String voice(String name); // with param

    public static  String v(){
        return "ttttt";
    }


    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
