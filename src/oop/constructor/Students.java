package oop.constructor;

public class Students extends Person{
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public Students(){

    }
    public Students(int age5,String n){
        super(age5);
        name = n;
    }

}
