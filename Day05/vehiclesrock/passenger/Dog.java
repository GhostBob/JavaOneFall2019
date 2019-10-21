package vehiclesrock.passenger;

public class Dog extends Passenger {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void enjoyTheRide() {
        System.out.println(this.name + " wags his tail.");
    }
}
