package oop.principsOOP.abstract1.project;

public abstract class Person {

    private int id;
    public String name;
    public int age;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract String work();
}
