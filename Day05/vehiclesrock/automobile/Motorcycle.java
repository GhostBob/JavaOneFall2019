package vehiclesrock.automobile;

import java.util.ArrayList;

public class Motorcycle extends Automobile {

    protected boolean hasSidecar;
    
    public Motorcycle() {
        this.numberOfGears = 5;
        this.topSpeed = 110;
        this.currentSpeed = 0;
        this.tireType = "Motorcycle Tires";
        this.maxPassengers = 2;
        this.currentPassengers = new ArrayList();
        this.acceleration = 25;
        this.braking = 20;
        this.VIN = Automobile.generateVIN();
        this.mileage = 0;
        this.hasSidecar = false;
    }

    public boolean hasSidecar() {
        return this.hasSidecar;
    }
    
    public void attachSidecar() {
        if (!this.hasSidecar) {
            this.maxPassengers += 1;
            this.hasSidecar = true;
        }
        else {
            System.out.println("Thing's already attached.");
        }
    }
    
    public void detachSidecar() {
        if (!this.hasSidecar) {
            System.out.println("Can't detach that which isn't there.");
        }
        if (this.currentSpeed > 0) {
            System.out.println("Can't detach. We're in motion!");
            return;
        }
        if (this.currentPassengers.size() == this.maxPassengers) {
            System.out.println("Can't detach. Someone's in the thing.");
            return;
        }
        
        this.maxPassengers -= 1;
        this.hasSidecar = false;
    }
}
