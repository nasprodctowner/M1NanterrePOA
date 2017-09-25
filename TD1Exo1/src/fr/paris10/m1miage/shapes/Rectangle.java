package fr.paris10.m1miage.shapes;

public class Rectangle extends Shape2D{

    protected double length;
    protected double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(Point2D refPoint, double length, double width) {
        super(refPoint);
        this.length = length;
        this.width = width;
    }

    @Override
    double perimeter(){
        return super.perimeter();
    }

    @Override
    double surface(){

        return super.surface();
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }
}
