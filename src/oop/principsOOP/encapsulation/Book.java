package oop.principsOOP.encapsulation;

public class Book {

    public Book(String name, int id, int copies, String author, int pages) {
        this.name = name;
        this.id = id;
        this.copies = copies;
        this.author = author;
        this.pages = pages;
    }

//    public Book(String name, int id, String author, int pages) {
//        this.name = name;
//        this.id = id;
//        this.author = author;
//        this.pages = pages;
//    }

    public String name;
    public int id;

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    private int copies = 100;  //default by us
                                // if we do not give value or we do not do reassign then it gives 0(default by java)
    public String author;
    public int pages;



}
