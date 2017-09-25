package fr.paris10.m1miage.shapes;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    double volume(){
        return super.volume();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
