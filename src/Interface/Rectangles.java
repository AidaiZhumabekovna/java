package Interface;

public class Rectangles implements Polygon, Language{
    public void getArea(int length, int breadth){
        System.out.println("The area of the rectangle: " + (length*breadth));
    }

    public void getName(String name){
        System.out.println("Pr l: " + name);
    }
}
