package fr.paris10.m1miage.shapes;

public class Square extends Rectangle {

    public Square(){
        super();
    }
    public Square(Point2D refPoint, double length, double width) {
        super(refPoint, length, width);
        if(length == width) {
            this.length = length;
            this.width = width;
        }else{
            System.out.println("It's not a square !!!");
        }
    }
}
