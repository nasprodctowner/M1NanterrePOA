package fr.paris10.m1miage.shapes;

public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double translate(double a, double b ){
        return 0.0;
    }

    boolean isOrigin(){
        return true;
    }

    double distance(Point2D p){
        return 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
