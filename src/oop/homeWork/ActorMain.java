package oop.homeWork;

public class ActorMain {
    public static void main(String[] args) {
        Actress1 actress1 = new Actress1("Selena", 33,"yes", 2);

        System.out.println(actress1.role());
        System.out.println(actress1.state(33));
        System.out.println(actress1.state("yes",2));
        System.out.println("----------------------------------");
        Actress2 actress2 = new Actress2("BredPit", 44, "no", 4);
        System.out.println(actress2.state(actress2.age));
        System.out.println(actress2.state(actress2.getMarried()));

    }
}
