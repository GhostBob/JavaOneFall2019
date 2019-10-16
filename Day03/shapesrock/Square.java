package shapesrock;

public class Square extends Rectangle {
    
    public Square() {
        this.length = 1;
        this.width = 1;
    }
    
    public Square(double height, double width) {
        this();
        
        if (height == 0 || width == 0 || width != height) {
            System.out.println("That's illegal. I'm giving a default square.");
        }
        else {
            this.length = height;
            this.width = width;
        }
    }
    
    @Override
    public String toString() {
        return "A Square.\n" + "Height: " + this.length + "\nWidth: " + this.width;
    }
}
