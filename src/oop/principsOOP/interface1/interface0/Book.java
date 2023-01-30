package oop.principsOOP.interface1.interface0;

public class Book implements Printable {
    @Override
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
    protected int yy;
    public Book(String name, String redactor, int pages, int yy) {
        this.name = name;
        this.redactor = redactor;
        this.pages = pages;
        this.yy = yy;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String print() {
        return this.name + " printing";
    }

    public String publishesOneTime(){
        return this.name + " published one time " + this.yy;
    }

//    @Override
//    public int getSample() {
//        return Printable.super.getSample();
//    }


    @Override
    public int getSample() {
        return this.pages;
    }
}
