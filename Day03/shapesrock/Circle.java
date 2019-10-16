package shapesrock;

public class Circle extends Shape {
    
    private double radius;

    public Circle() {
        this.radius = 1;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
