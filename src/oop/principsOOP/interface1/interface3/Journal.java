package oop.principsOOP.interface1.interface3;

import oop.principsOOP.interface1.nestedInterface.Printer;

import javax.swing.*;

public class Journal implements Printable2 {
    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String print() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String print2() {
        return Printable2.super.print2();
    }
}
