package oop.principsOOP.abstract1;

import oop.principsOOP.abstract1.Animal2;

public class Dog2 extends Animal2 {

    public Dog2(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "bark bark";
    }
}
