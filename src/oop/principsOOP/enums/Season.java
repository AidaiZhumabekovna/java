package oop.principsOOP.enums;

public enum Season {
    //when we create constructor in enum, be default constructor in enum is private

    SUMMER("лето", 30),WINTER("зима",-29), AUTUMN("осень", 14), SPRING("весна", 17);  //THEY are not string, they are Season enum's object ;
    private String translation;

    public int getTemperature() {
        return temperature;
    }

    private int temperature;

    Season(String translation, int temperature) {
        this.translation = translation;
        this.temperature = temperature;
    }

    public String getTranslation() {
        return translation;
    }




    @Override
    public String toString() {
        return "перевод на русский язык: " + translation + "\n" + "среднее температура летом: " + temperature;
    }
}
