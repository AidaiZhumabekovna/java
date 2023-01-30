package oop.principsOOP.inheritance;


// Inheritance -

// child = subclass
// parent = super

//overloading - same method with different amount parameters
//override - same method, but different implementation(dynamic polymorphism - my sdelaem raznye realizatsia v raznom klasse)
// and also have method which we do not realize, (
// этот метод общий: public String run(){} - все животные бегает поэтому мы не реализуем его
// просто пишем в родит-м классе  и он работает везде по умолчанию

// EX: доктор лечить()
    //    -> хирург как лечить
   ///    -> стомотолог как лечить
public class Animals {
    public Animals(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String name;
    public int age;
    public String breed;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String animalsVoice(){
        return "voice";
    }


    public  String animalVoice(){
        return "voice";
    };
}
