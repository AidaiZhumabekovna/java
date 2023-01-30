package oop.principsOOP.interface1.interface0;

public class Main2 {
    public static void main(String[] args) {
        Book book = new Book("Aitmatov", "Djamilia", 434, 1999);
        System.out.println(book.print());
        System.out.println(book.publishesOneTime());
        System.out.println(book.getSample());
        System.out.println(book.getSample(3));

        System.out.println("-------------------------------");
        Magazine magazine = new Magazine("Tolstoy", "War and world", 444);
        System.out.println(magazine.print());
        System.out.println(magazine.publishesMonthly());

        System.out.println("-------------------------------");
        Printable book2 = new Book("Aitmatov", "first teacher", 444, 1993);
        System.out.println(book2.print());

    }
}
