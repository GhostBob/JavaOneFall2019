package vehiclesrock;

import vehiclesrock.automobile.*;
import vehiclesrock.bicycle.*;
import vehiclesrock.passenger.*;

public class VehiclesRock {

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle b1 = new MountainBike();
        
        Passenger p = new Human("Robert");
        Passenger p2 = new Dog("Fido");
        car.addPassenger(p);
        car.addPassenger(p2);
        car.accelerate();
        car.coast();
        car.removePassenger(p);
        b1.addPassenger(p);
        b1.accelerate();
        b1.accelerate();
        b1.accelerate();
        b1.accelerate();
        b1.removePassenger(p);
        System.out.println("b1 speed: " + b1.getCurrentSpeed());
        b1.brake();
        System.out.println("b1 speed: " + b1.getCurrentSpeed());
        b1.removePassenger(p);
    }
}
