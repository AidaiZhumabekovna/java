package oop.principsOOP.polymorphism;

public class JLo extends Singer{

    public JLo(String name, int age, String genre, String phoneNumber) {
        super(name, age, genre, phoneNumber);
    }

    @Override
    public String singing() {
        return "Dance ";
    }

    @Override
    public String singing(String name2) {
        return name2 + ": is singer";
    }

    @Override
    public String singing2(int num) {
        return super.singing2(89);
    }
}
