package oop.principsOOP.interface1.constants;

public class WaterPipe implements Statable{
    @Override
    public void printState(int n) {
        if (n == OPEN){
            System.out.println("Water is opened");
        } else if (n == CLOSED) {
            System.out.println("Water is closed");
        }else{
            System.out.println("state is invalid");
        }
    }
}
