package oop.constructor;

public class ComplexMain {
    public static void main(String[] args) {

        Complex c1 = new Complex(10, 15);

        Complex c2 = new Complex(c1);
        Complex c3 = c2;
        System.out.println(c2);
    }
}
