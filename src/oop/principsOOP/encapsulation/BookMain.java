package oop.principsOOP.encapsulation;

public class BookMain {
    public static void main(String[] args) {
        Book potter = new Book("Jack London", 23, 999, "Jack", 300);
        potter.name = "Jim";
        // get access to private instance var
        //copies are private couse of we cannot edit or change
//        potter.co
        //чтобы получить доступ к прайвт переменный мы должны создать геттер и сеттер

       // Encapsulation - котороя помогает нам дать доступ к прайвт переменным
                           // это развертывания прайвт переменных через геттер и сеттер
         //getter - we get method's value
        // setter - we can't get value we can set value, cause of set method can be only void(non return)
        System.out.println(potter.getCopies());
        potter.setCopies(444);
        System.out.println(potter.getCopies());


    }
}
