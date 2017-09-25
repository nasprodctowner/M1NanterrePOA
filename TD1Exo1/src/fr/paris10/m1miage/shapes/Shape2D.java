package fr.paris10.m1miage.shapes;

public class Shape2D extends Shape implements Translatable2D {

    private Point2D refPoint;

    public Shape2D(){
    }

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    double perimeter(){

        return 0.0;
    }

    public Point2D getRefPoint() {

        return refPoint;
    }

    public void setRefPoint(Point2D refPoint) {

        this.refPoint = refPoint;
    }




}
