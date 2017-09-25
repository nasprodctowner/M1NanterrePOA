package fr.paris10.m1miage.shapes;

public class Cuboid extends Shape3D{

    private double length;
    private double width;
    private double height;

    public Cuboid(Point3D refPoint, double length, double width, double height) {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double volume(){
        return super.volume();
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
