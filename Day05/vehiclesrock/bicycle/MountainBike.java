package vehiclesrock.bicycle;

public class MountainBike extends Bicycle {

    protected String suspensionTension;
    
    public MountainBike() {
        super();
        this.numberOfGears = 15;
        this.topSpeed = 20;
        this.tireType = "Sturdy as Hell Tires!";
        this.suspensionTension = "Medium";
    }
    
    public MountainBike(int saddleHeight) {
        this();
        this.saddleHeightInInches = saddleHeight;
    }
    
    // ** STANDARD GETTERS AND SETTERS ** 

    public String getSuspensionTension() {
        return suspensionTension;
    }

    public void setSuspensionTension(String suspensionTension) {
        this.suspensionTension = suspensionTension;
    }
}
