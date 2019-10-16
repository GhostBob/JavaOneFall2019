package shapesrock;

import apple.laf.JRSUIConstants;
import java.util.ArrayList;
import shapesrock.Circle;
import shapesrock.Rectangle;
import shapesrock.Shape;
import shapesrock.Square;
import shapesrock.Triangle;

public class ShapesRock {

    public static void main(String[] args) {

        //Create a Circle
        Circle c = new Circle(4);
        //Print perimeter
        System.out.println("Circle perimeter: " + c.getPerimeter());
        //Print area
        System.out.println("Circle area: " + c.getArea());

        //Create a Rectangle
        Rectangle rect = new Rectangle(10, 5);
        //Print perimeter
        System.out.println("Rect perimeter: " + rect.getPerimeter());
        //Print area
        System.out.println("Rect area: " + rect.getArea());

        //Create a Square
        Square square = new Square(10, 10);
        System.out.println(square);
        //Print perimeter
        System.out.println("Square perimeter: " + square.getPerimeter());
        //Print area
        System.out.println("Square area: " + square.getArea());

        //Create a Triangle
        Triangle t = new Triangle(3, 4, 5);
        //Print perimeter
        System.out.println("Triangle perimeter: " + t.getPerimeter());
        //Print area
        System.out.println("Triangle area: " + t.getArea());

        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Circle());
//        shapes.add(new Person());  //This won't work, and that's GREAT!

        ArrayList<Rectangle> rects = new ArrayList();
        rects.add(new Square());
        rects.add(new Rectangle());
//        rects.add(new Circle()); //This won't work either, and that's GREAT!

        System.out.println("\n\nAbstract Shapes:\n");

        for (Shape s : shapes) {
            if (s instanceof Square) {
                Square tempSquare = (Square) s;
                System.out.println("The shape is a square.");
            } else {
                System.out.println("The shape is NOT a square.");
            }
            System.out.println("Perimeter: " + s.getPerimeter());
            System.out.println("Area: " + s.getArea());
        }
    }
}
