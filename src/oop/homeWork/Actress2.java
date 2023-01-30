package oop.homeWork;

public class Actress2 extends Actor{
    public Actress2(String name, int age, String married, int children) {
        super(name, age, married, children);
    }

    @Override
    public String state(int age) {
        return "BredPit's age: " + age;
    }

    public String state(String married1){
        return "BredPit is married?: " + married1;  ////??????????????
    }
}
