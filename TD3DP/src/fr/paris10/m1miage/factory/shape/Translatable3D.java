package fr.paris10.m1miage.factory.shape;

public interface Translatable3D extends Translatable2D {
    public Point3D getRefPoint();
    public void translate(double dx, double dy, double dz);
}
