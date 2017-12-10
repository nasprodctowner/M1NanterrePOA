package pattern.factorymethod.shapes.api;

public final class ShapeFactory {
    public Shape2D createSquareWithNoParams(){
        return new Square();
    }

    public Shape2D createSquareWithParams(Point2D point2D, double size){
        return new Square(point2D,size);
    }

    public Shape2D createRectangleWithNoParams() {
        return new Rectangle();
    }

    public Shape2D  createRectangleWithParams(Point2D point2D, double l, double w) {
        return new Rectangle(point2D,l,w);
    }

    public Shape3D createConeWithNoParams(){
        return new Cone();
    }

    public Shape3D createConeWithParams(Point3D point3D, double h, double r ){
        return new Cone(point3D,h,r);
    }


    public Shape3D createSphereWithNoParams() {
        return new Sphere();
    }

    public  Shape3D createSphereWithParams(Point3D point3D, double r) {
        return new Sphere(point3D,r);
    }

    public Shape3D createCuboidWithNoParams() {
        return  new Cuboid();
    }

    public Shape3D createCuboidWithParams(Point3D point3D, int l, int w, int h) {
        return new Cuboid(point3D,l,w,h);
    }
}
