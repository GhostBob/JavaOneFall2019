package vehiclesrock.automobile;

import java.util.ArrayList;

public class Car extends Automobile {

    public Car() {
        this.numberOfGears = 5;
        this.topSpeed = 120;
        this.currentSpeed = 0;
        this.tireType = "Regular Car Tires";
        this.maxPassengers = 4;
        this.currentPassengers = new ArrayList();
        this.acceleration = 15;
        this.braking = 10;
        this.VIN = Automobile.generateVIN();
        this.mileage = 0;
    }
}
