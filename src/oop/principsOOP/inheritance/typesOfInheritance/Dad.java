package oop.principsOOP.inheritance.typesOfInheritance;

public class Dad extends Grandfather{
    // If parent class has empty constructor and constructor with params then we must create both constructors in child class


    public Dad(String name, int age, String eyeColors, boolean mole, boolean allergy, int bloodType) {
        super(name, age, eyeColors, mole, allergy);
        this.bloodType = bloodType;
    }

    public int bloodType;

    public Dad(String name, int age, String eyeColors, boolean mole, boolean allergy) {
        super(name, age, eyeColors, mole, allergy);
    }

    public Dad() {
    }
}
