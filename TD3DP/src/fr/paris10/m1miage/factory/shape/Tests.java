package fr.paris10.m1miage.factory.shape;

public class Tests {
    public static void main(String[] args) {
        Point2D p2_0 = new Point2D();
        Point2D p2_1 = new Point2D(2, 4);
        Point3D p3_0 = new Point3D();
        Point3D p3_1 = new Point3D(2, 3, 4);

        ShapeFactory f = new ShapeFactory();

        //
        // Square fail1 = new Shape2D(); // impossible
        Shape2D pas_fail1 = f.createSquare();

        System.out.println(pas_fail1); // square
        //
        Shape2D s1 = f.createSquare(p2_0, 20);

        System.out.println(s1); // square
        System.out.println(s1.perimeter() + " " + s1.surface());

        Shape2D s2 = f.createRectangle(p2_1, 20, 30);
        System.out.println(s2); // rectangle
        //
        Shape2D r1 = f.createRectangle();
        System.out.println(r1); // rectangle
        System.out.println(r1.perimeter() + " " + s1.surface());
        //

        Shape3D c1 = f.createCone(p3_1, 10, 20);
        System.out.println(c1); // cone
        System.out.println(c1.volume() + " " + c1.surface());
        //

        Shape3D h1 = f.createSphere(p3_1, 10);
        System.out.println(h1); // sphere
        System.out.println(h1.volume() + " " + h1.surface());
        //

        Shape3D k1 = f.createCuboid(p3_1, 10, 20, 30);
        System.out.println(k1); // cuboid
        System.out.println(k1.volume() + " " + k1.surface());

    }
}
