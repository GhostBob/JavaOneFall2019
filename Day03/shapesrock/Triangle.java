package shapesrock;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;
    
    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }
    
    public Triangle(double side1, double side2, double side3) {
        this();
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && 
                side1 + side3 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else {
            System.out.println("That's illegal. I'm giving you the default.");
        }
    }
    
    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }
}
