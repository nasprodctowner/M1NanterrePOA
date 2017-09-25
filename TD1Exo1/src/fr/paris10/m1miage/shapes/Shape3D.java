package fr.paris10.m1miage.shapes;

public class Shape3D extends Shape implements Translatable3D {

    protected Point3D refPoint;

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    double volume() {
        return 0;
    }

    @Override
    public Point3D getRefPoint() {
        return null;
    }

    public void setRefPoint(Point3D refPoint) {
        this.refPoint = refPoint;
    }
}
