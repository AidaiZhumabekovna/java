package Polimorfism.Overloading;

public class Pattern {

//    method without parameters
    public void display(){
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }


//    method with parameter
    public void display(char symbol){
        for (int i = 0; i < 10; i++) {
            System.out.println(symbol);
        }
    }


}
