package pattern.factorymethod.shapes.client;

import pattern.factorymethod.shapes.api.*;

public class Client {
    public static void main(String[] args) {
        Point2D p2_0 = new Point2D();
        Point2D p2_1 = new Point2D(2,4);
        Point3D p3_0 = new Point3D();
        Point3D p3_1 = new Point3D(2,3,4);

        //Factory
        ShapeFactory factory = new ShapeFactory();

        // Square square = new Shape2D(); // impossible car shape2D est abstraite

        Shape2D squareWithNoParams = factory.createSquareWithNoParams();
        System.out.print(squareWithNoParams); // square
        System.out.println(" Perimeter: "+squareWithNoParams.perimeter()+" Surface : "+squareWithNoParams.surface());

        Shape2D squareWithParams = factory.createSquareWithParams(p2_0,20);
        System.out.print(squareWithParams); //square
        System.out.println(" Perimeter: "+squareWithParams.perimeter()+" Surface : "+squareWithParams.surface());


        Shape2D rectangleWithNoParams = factory.createRectangleWithNoParams();
        System.out.print(rectangleWithNoParams); // rectangle
        System.out.println(" Perimeter: "+squareWithNoParams.perimeter()+" Surface : "+rectangleWithNoParams.surface());

        Shape2D rectangleWithParams = factory.createRectangleWithParams(p2_1, 20, 30);
        System.out.print(rectangleWithParams); // rectangle
        System.out.println(" Perimeter: "+rectangleWithParams.perimeter()+" Surface : "+rectangleWithParams.surface());

        Shape3D coneWithNoParams = factory.createConeWithNoParams();
        System.out.print(coneWithNoParams); // cone
        System.out.println(" Volume : "+coneWithNoParams.volume() + " Surface : " + coneWithNoParams.surface());

        Shape3D coneWithParams = factory.createConeWithParams(p3_1, 10, 20);
        System.out.print(coneWithParams); // cone
        System.out.println(" Volume : "+coneWithParams.volume() + " Surface : " + coneWithParams.surface());

        Shape3D sphereWithNoParams = factory.createSphereWithNoParams();
        System.out.print(sphereWithNoParams); // sphere
        System.out.println(" Volume : "+sphereWithNoParams.volume() + " Surface : " + sphereWithNoParams.surface());

        Shape3D sphereWithParams = factory.createSphereWithParams(p3_1, 10);
        System.out.print(sphereWithParams); // sphere
        System.out.println(" Volume : "+sphereWithParams.volume() + " Surface : " + sphereWithParams.surface());

        Shape3D cuboidWithNoParams = factory.createCuboidWithNoParams();
        System.out.print(cuboidWithNoParams); // cuboid
        System.out.println(" Volume : "+cuboidWithNoParams.volume() + " Surface : " + cuboidWithNoParams.surface());

        Shape3D cuboidWithParams = factory.createCuboidWithParams(p3_1, 10, 20, 30);
        System.out.print(cuboidWithParams); // cuboid
        System.out.println(" Volume : "+cuboidWithParams.volume() + " Surface : " + cuboidWithParams.surface());

    }
}
