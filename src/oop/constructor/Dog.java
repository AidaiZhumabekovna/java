package oop.constructor;

public class Dog {
    @Override
    public String toString() {
        return "Dog2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String name;
    public int age;
    public String breed;
    public String color;

    public Dog(){

    }
//    private Dog(String name2){   // if constructor is private then we cannot create object
                                    // мы не сможем создавать этого класса
//        name = name2;
//    }

}
