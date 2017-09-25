package fr.paris10.m1miage.shapes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D p = new Point2D(0,0);
        Square s = new Square(p,222,54);

        System.out.println(s.length+" "+s.width);
    }
}
