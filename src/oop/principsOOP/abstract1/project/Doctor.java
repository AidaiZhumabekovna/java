package oop.principsOOP.abstract1.project;

import java.util.ArrayList;

public class Doctor extends Person{

    public String field;
    public int experience;

    public Doctor(int id, String name, int age, String field, int experience) {
        super(id, name, age);
        this.field = field;
        this.experience = experience;
    }

    @Override
    public String work() {
        return this.name +": treat" + "\n"
                + "Field:"+ this.field +"\n"
                + "Experience" + this.experience;
    }

    public String treat(ArrayList<Patient> listOfPatient){
        String result = "";

        for (Patient com : listOfPatient){
            if(com.complaint.equals("teath")){
                result = "Dr." + this.name + "will treat";
            }else {
                result = "Dr." + this.name + "will not treat";
            }
        }
        return result;
    }
}
