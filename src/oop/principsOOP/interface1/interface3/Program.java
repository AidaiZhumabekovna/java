package oop.principsOOP.interface1.interface3;

public class Program {
    public static void main(String[] args) {
//     В тоже время мы не можем напрямую создавать объекты интерфейсов,
//     поэтому следующий код не будет работать:

//        Printable pr = new Printable();
//        pr.print();
//
//        Book book = new Book("Jamilia", "Aitmatov");
//        System.out.println(book);
//        System.out.println(book.print());

//        Printable2 printable2 = new Book("Jamilia \n", "Aitmatov");
//        System.out.println(printable2.print());
//        printable2 = new Journal("Baichechekei");
//        System.out.println(printable2.print());

//        Printable2 p = new Journal("Foreign Affairs");
//        System.out.println(p.print());
//
//        String name = ((Journal)p).getName();
//        System.out.println(name);


        Book book = new Book("Jamilia", "Aitmatov");
        System.out.println(book.print());
        System.out.println(book.print2());
        System.out.println(Printable2.read());

        Journal journal = new Journal("Foreign Affairs");
        System.out.println(journal.print());
        System.out.println(journal.print2());
        System.out.println(Printable2.read());
        System.out.println(journal.print2());
    }
}
