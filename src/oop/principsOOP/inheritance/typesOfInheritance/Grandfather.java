package oop.principsOOP.inheritance.typesOfInheritance;

public class Grandfather {
    public Grandfather(String name, int age, String eyeColors, boolean mole, boolean allergy) {
        this.name = name;
        this.age = age;
        this.eyeColors = eyeColors;
        this.mole = mole;
        this.allergy = allergy;
    }

    public Grandfather() {
    }

//    public String getName() {  // there is no point - нет смысла без геттера видет
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }

    public String getEyeColors() {
        return eyeColors;
    }

    public boolean isMole() {   // логический
        return mole;
    }

    public boolean isAllergy() {
        return allergy;
    }

         public String name;
         public int age;
         protected String eyeColors;  //
         private boolean mole;
         private boolean allergy;


         public String drawing(){
             return "DRAWING";
         }

         public String joking(){
             return "HA HA HA";
         }

         public String storyTelling(){
             return "Manas Manas boluptur";
         }
}
