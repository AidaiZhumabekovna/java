package oop.principsOOP.polymorphism;

public class MainSingin {
    public static void main(String[] args) {
        JLo jLo = new JLo("Shakira", 34, "hip","+134567432");
        System.out.println(jLo);

        System.out.println(jLo.singing());
        System.out.println(jLo.singing("Shakira"));
        System.out.println(jLo.singing2(jLo.age));
    }

}
