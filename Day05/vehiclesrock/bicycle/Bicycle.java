package vehiclesrock.bicycle;

import java.util.ArrayList;
import vehiclesrock.Vehicle;

public class Bicycle extends Vehicle {

    protected int saddleHeightInInches;
    
    public Bicycle() {
        this.numberOfGears = 5;
        this.topSpeed = 25;
        this.tireType = "Normal Bike Tires";
        this.maxPassengers = 1;
        this.currentPassengers = new ArrayList();
        this.acceleration = 5;
        this.braking = 10;
        this.saddleHeightInInches = 4;
    }
    
    public Bicycle(int saddleHeight) {
        this();
        this.saddleHeightInInches = saddleHeight;
    }
    
    public void setSaddleHeightInInches(int height) {
        if (this.currentPassengers.isEmpty())
            this.saddleHeightInInches = height;
        else
            System.out.println("Get off the bike before changing the seat.");
    }
    
    public int getSaddleHeightInInches() {
        return this.saddleHeightInInches;
    }
}
