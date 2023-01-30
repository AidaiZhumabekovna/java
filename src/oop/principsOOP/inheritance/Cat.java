package oop.principsOOP.inheritance;


// Inheritance - reliabilities, reduce(сокращает) code
public class Cat extends Animals {  // here appeared red line(swears - ругается) ,
                                    // we must create constructor current class
                                   // ругался только из-за правильеости конструктора
                                   // when we extends we use super - it means we extend from parent class

    public Cat(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }

    @Override
    public String animalVoice() {
        return "meow";
    }
}
