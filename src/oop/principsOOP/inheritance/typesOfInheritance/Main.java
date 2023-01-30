package oop.principsOOP.inheritance.typesOfInheritance;

public class Main {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather();
        Grandfather gran2 = new Grandfather("John", 67, "brown", true, false);

        Dad dad2 = new Dad();
        Dad dad = new Dad("Doe", 34, "blue", true, true);
        Dad dad3 = new Dad("Jack", 22, "green", false, false, 3);



    }
}
