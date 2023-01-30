package oop.homeWork;

public class Actor {
    public Actor(String name, int age, String married, int children) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.children = children;
    }

    public String name;
    public int age;

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    private String married;
    private int children;

    public String role(){
        return "Main ";
    }

    public String state(int age){
        return "Actor's" + age;
    }

    public String state(String married1, int children1){
        return "Actor: " + married1 + "and has: " + children1;
    }
}
