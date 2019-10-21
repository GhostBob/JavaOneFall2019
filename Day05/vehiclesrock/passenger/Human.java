package vehiclesrock.passenger;

import java.util.Random;

public class Human extends Passenger {

    public Human(String name) {
        super(name);
    }
    
    @Override
    public void enjoyTheRide() {
        Random random = new Random();
        System.out.print(this.name);
        int choice = random.nextInt(6);
        switch(choice) {
            case 0:
                System.out.println(" whistles a tune.");
                break;
            case 1:
                System.out.println(" sighs contentedly.");
                break;
            case 2:
                System.out.println(" rocks out to the radio.");
                break;
            case 3:
                System.out.println(" zones out.");
                break;
            case 4:
                System.out.println(" thinks about programming.");
                break;
            default:
                System.out.println(" talks about how awesome Steven is.");
        }
    }

}
