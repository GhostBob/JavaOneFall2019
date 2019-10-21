package vehiclesrock;

import java.util.Random;
import java.util.ArrayList;

import vehiclesrock.passenger.Human;
import vehiclesrock.passenger.Passenger;

public abstract class Vehicle {

    protected int numberOfGears;
    protected int topSpeed;
    protected int currentSpeed;
    protected String tireType;
    protected int maxPassengers;
    protected ArrayList<Passenger> currentPassengers;

    protected int acceleration;
    protected int braking;

    public void accelerate() {

        if (this.currentPassengers.isEmpty() || !this.containsHuman()) {
            System.out.println("Who do you think is driving this thing?!");
            return;
        }

        this.currentSpeed += acceleration;
        if (this.currentSpeed > this.topSpeed) {
            this.currentSpeed = this.topSpeed;
        }
    }

    public void brake() {
        this.currentSpeed -= braking;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    public void printCurrentSpeed() {
        System.out.println("Current Speed: " + this.currentSpeed);
    }

    public boolean containsHuman() {
        for (Passenger p : this.currentPassengers) {
            if (p instanceof Human) {
                return true;
            }
        }
        return false;
    }

    public void addPassenger(Passenger p) {
        if (currentPassengers.size() < maxPassengers) {
            if (currentSpeed <= 15) {
                currentPassengers.add(p);
            } else {
                System.out.println("Thing's moving too fast to jump in!");
            }
        } else {
            System.out.println("No can do. Vehicle's full up, yo!");
        }
    }

    public Passenger removePassenger() {
        if (currentPassengers.isEmpty()) {
            System.out.println("Can't remove something that isn't there...");
            return null;
        }
        if (currentSpeed > 15) {
            System.out.println("We're going too fast to jump out! Slow down!");
            return null;
        }
        Random random = new Random();
        int passengerNumber = random.nextInt(currentPassengers.size());
        Passenger p = currentPassengers.get(passengerNumber);
        currentPassengers.remove(passengerNumber);
        return p;
    }

    public void removePassenger(Passenger p) {
        if (currentSpeed > 15) {
            System.out.println("We're going too fast to jump out! Slow down!");
            return;
        }
        if (currentPassengers.contains(p)) {
            currentPassengers.remove(p);
            if (!this.containsHuman() && this.currentSpeed != 0)
                System.out.println("...and the vehicle crashes?");
        } else {
            System.out.println(p.getName() + " isn't in the vehicle, dood.");
        }
    }

    public void coast() {
        if (this.currentSpeed > 0) {
            for (Passenger p : this.currentPassengers) {
                p.enjoyTheRide();
            }
        }
        else {
            System.out.println("Hard to coast if you're not going anywhere...");
        }
    }
    
    public void setMaxPassengers(int maxPassengers) {
        if (this.currentPassengers.isEmpty()) 
            this.maxPassengers = maxPassengers;
        else
            System.out.println("Empty the vehicle before you change the seats!");
    }
    
    // ** STANDARD GETTERS AND SETTERS **
    
    public int getCurrentPassengerCount() {
        return this.currentPassengers.size();
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
    
    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getBraking() {
        return braking;
    }

    public void setBraking(int braking) {
        this.braking = braking;
    }
    
    
}
