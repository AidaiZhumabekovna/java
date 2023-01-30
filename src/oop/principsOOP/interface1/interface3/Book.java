package oop.principsOOP.interface1.interface3;

public class Book implements Printable2{
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    String name;
    String author;

    public String print() {
       return  this.name + this.author;
    }

    @Override
    public String print2() {
        return "AAAAAAAA";
    }


}
