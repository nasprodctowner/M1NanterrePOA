package fr.paris10.m1miage.shapes;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    double translate(double a, double b) {

        return super.translate(a, b);
    }

    @Override
    boolean isOrigin() {
        return super.isOrigin();
    }

    @Override
    double distance(Point2D p) {

        return super.distance(p);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
