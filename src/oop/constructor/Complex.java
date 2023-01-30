package oop.constructor;

public class Complex {
    private double re, im;

    public Complex(double re2, double im2){
        re = re2;
        im = im2;
    }

    Complex(Complex c){
        re = c.re;
        im = c.im;
    }

    public String toString(){
        return "(" + re + " + " + im + "i)";
    }


}
