package oop.principsOOP.inheritance.typesOfInheritance;

public class Son extends Dad{
    public Son(String name, int age, String eyeColors, boolean mole, boolean allergy) {
        super(name, age, eyeColors, mole, allergy);
    }

    public Son() {
    }

    public Son(String name, int age, String eyeColors, boolean mole, boolean allergy, int bloodType) {
        super(name, age, eyeColors, mole, allergy, bloodType);
    }


//    TYPES OF INHERITANCE
    // 1. Single
    // 2. Multilevel
    // 3. Hierarchical(Иерархический)

    // A <- B  From Dad <- Son
    // A <- B <- C   From GrandPa <- Dad <- Son

    //     A        Dad <- first child, second child
    //   |   |
    //   B   C

}
