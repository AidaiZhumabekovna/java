package oop.homeWork;

public class Actress1 extends Actor{

    public Actress1(String name, int age, String married, int children) {
        super(name, age, married, children);
    }

    @Override
    public String role() {
        return super.role();
    }

    public String state(int age){
        return "Selina's age :" + age;
    }

    @Override
    public String state(String married1, int children1) {
        return "Selena married : " + married1 + "\n Selena's children: " + children1 ;
    }
}
