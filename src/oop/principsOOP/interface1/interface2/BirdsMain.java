package oop.principsOOP.interface1.interface2;

public class BirdsMain {
    public static void main(String[] args) {
        AngryBirds birds = new AngryBirds();
        System.out.println(birds.fly());
        System.out.println(birds.fly2());
//        System.out.println(birds.fly2());
        System.out.println(Fly.fly3());
        System.out.println(birds);

    }
}
