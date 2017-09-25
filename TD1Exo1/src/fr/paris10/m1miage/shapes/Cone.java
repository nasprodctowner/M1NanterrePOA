package fr.paris10.m1miage.shapes;

public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone(Point3D refPoint, double height, double radius) {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    @Override
    double volume() {
        return super.volume();
    }

    @Override
    double surface(){
        return super.surface();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
