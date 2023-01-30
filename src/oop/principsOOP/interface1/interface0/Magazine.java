package oop.principsOOP.interface1.interface0;

public class Magazine implements Printable {

    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", redactor='" + redactor + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String name;
    public String redactor;
    private int pages;
    public Magazine(String name, String redactor, int pages) {
        this.name = name;
        this.redactor = redactor;
        this.pages = pages;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String print() {
        return this.name + "printing";
    }

    public String publishesMonthly(){
        return this.name + "published 12 times";
    }
}
