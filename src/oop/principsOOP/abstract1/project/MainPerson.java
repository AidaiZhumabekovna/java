package oop.principsOOP.abstract1.project;

import javax.print.Doc;
import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(1111, "Dastan", 54, "dentist", 10);

        String complaint = "teath";
        Patient patient = new Patient(222, "Aidai", 32, "teath");
        Patient patient2 = new Patient(333, "Gulnara", 34, "teath");
        Patient patient3 = new Patient(555, "Nazik", 34, "headache");


        ArrayList<Patient> listOpPatient = new ArrayList<>();
//        listOpPatient.add(doctor);
        listOpPatient.add(patient);
        listOpPatient.add(patient2);
        listOpPatient.add(patient3);
    }
}
