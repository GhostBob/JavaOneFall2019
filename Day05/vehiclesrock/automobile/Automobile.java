package vehiclesrock.automobile;

import java.util.Random;
import vehiclesrock.Vehicle;

public abstract class Automobile extends Vehicle {

    protected String VIN;
    protected int mileage;
    
    protected static String generateVIN() {
        Random random = new Random();
        int size = 17;
        char[] vin = new char[size];
        for (int i=0; i<size; ++i) {
            int choice = random.nextInt(5);
            char c;
            switch (choice) {
                case 0:
                case 1:
                    c = (char)(random.nextInt(26)+97);
                    break;
                case 2:
                case 3:
                    c = (char)(random.nextInt(26)+65);
                    break;
                default:
                    c = (char)(random.nextInt(10)+48);
                    break;
            }
            vin[i] = c;
        }
        String vinString = new String(vin);
        return vinString;
    }

    @Override
    public void coast() {
        super.coast();
        this.mileage += this.currentSpeed;
    }
    
    // ** STANDARD GETTERS AND SETTERS **
    
    public String getVIN() {
        return this.VIN;
    }
    
    public int getMileage() {
        return this.mileage;
    }
}
