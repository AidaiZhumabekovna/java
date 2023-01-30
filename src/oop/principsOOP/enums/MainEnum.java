package oop.principsOOP.enums;

public class MainEnum {
    public static void main(String[] args) {
//
//        Animal animal = Animal.CAT;
//        System.out.println(animal);
////
////        switch (animal){
////            case CAT:
////                System.out.println("this is cat");
////                break;
////            case DOG:
////                System.out.println("This is dog");
////
////                break;
////        }


//        Season season = Season.SUMMER;
//        System.out.println(season instanceof Season);
//        switch (season){
//            case AUTUMN:
//                System.out.println("it's a rainy outside");
//                break;
//            case SUMMER:
//                System.out.println("it's a HOT outside");
//                break;
//            case WINTER:
//                System.out.println("it's a COLD outside");
//                break;
//            case SPRING:
//                System.out.println("it's a CLOUDLY outside");
//        }



//        Season season = Season.SUMMER;
//        System.out.println(season.getTranslation());
//        System.out.println(season);
//        System.out.println(season.getTemperature());
//        System.out.println(season);


        //METHODS ENUM
        Season season = Season.SUMMER;
        System.out.println(season.name());
        System.out.println(season.ordinal());  // find index


        Season season1 = Season.valueOf("WINTER");  // get value of constants
        System.out.println(season1.getTranslation());



    }
}
