package oop.constructor;

public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String name;
    public String lastName;
    public int age;
    public double height;
    public char gender;
    public String phoneNumber;

    public Person(){
        //DEFAULT CONSTRUCTOR. WE CAN USE IN THE FUTURE
    }

    public Person(String name2, String lastName2, int age2, double height2, char gender2, String phoneNumber2){
        name = name2;
        lastName = lastName2;
        age = age2;
        height = height2;
        gender = gender2;
        phoneNumber = phoneNumber2;
    }

    public Person(int age4){
        age = age4;
    }


    public void work(){
        System.out.println("person have to work");
    }


}
