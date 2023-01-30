package oop.principsOOP.polymorphism;

public abstract class Singer {


    //Polymorphism same method but different params (overloading)
     //Это один из принципов ООП это методы которые имееть одинаковые название и
    // разные количество параметров и типы тоже должны быть разные(метод - параметр разными типами
    // один и тот же метод но разные количество параметров и название одинаковые

    //конструктор оверлодится

    //все что жирные мы override

    //constructor impossible override only overloading
    public Singer(String name, int age, String genre, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String name;
    protected int age;
    public String genre;
    private String phoneNumber;


    public String singing(){
        return "HipHop";
    }

    public  String singing(String name2){
        return name + "who";
    }

    public String singing2(int num){
        return "Aidai: "+ num;
    }
}
