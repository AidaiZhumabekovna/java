package oop.principsOOP.interface1.constants;

public interface Statable {
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);

    static int printSt2(int OPEN, int CLOSED){
       return 1;
    }
}
