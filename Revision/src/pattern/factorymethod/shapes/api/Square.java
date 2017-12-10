package pattern.factorymethod.shapes.api;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public final class Square extends Rectangle {
    Square() {
        this(new Point2D(), 10);
    }

    Square(Point2D rp, double size) {

        super(rp, size, size);
    }

    double getSize() {
        // attribut calculé
        return this.getWidth();
    }

    @Override
    public String toString() {
        return "I am a square " + getRefPoint().toString() + " Size : " + getSize();
    }
}
