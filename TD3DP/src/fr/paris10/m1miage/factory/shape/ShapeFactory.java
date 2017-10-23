package fr.paris10.m1miage.factory.shape;

public class ShapeFactory {
    Shape2D createSquare(){
        return new Square();
    }
    Shape2D createSquare(Point2D p, int size){
        return new Square(p,size);
    }

    Shape2D createRectangle(){
        return new Rectangle();
    }

    Shape2D createRectangle(Point2D p, double l, double w){
        return new Rectangle(p,l,w);
    }

    Shape3D createCuboid(){
        return new Cuboid();
    }
    Shape3D createCuboid(Point3D p, double l, double w, double h){
        return new Cuboid(p,l,w,h);
    }

    Shape3D createCone(){
        return new Cone();
    }

    Shape3D createCone(Point3D p, double h, double r ){
        return new Cone(p,h,r);
    }

    Shape3D createSphere(){
        return new Sphere();
    }
    Shape3D createSphere(Point3D p, double r){
        return new Sphere(p,r);
    }
}
