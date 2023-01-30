package oop.principsOOP.abstract1.project;

public class Patient extends Person{

    public String complaint;
    public Patient(int id, String name, int age, String complaint) {
        super(id, name, age);
        this.complaint = complaint;
    }

    @Override
    public String work() {
        if(working(this.age) == true){
            return "You have to pay";
        }else{
            return "Will get free service";
        }
    }

    public boolean working(int age){
        if(age >= 65){
            return false;
        }else{
            return true;
        }
    }
}
