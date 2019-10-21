package vehiclesrock.passenger;

public abstract class Passenger {

    protected String name;
    
    public Passenger(String name) {
        this.name = name;
    }
        
    public abstract void enjoyTheRide();
    
    
    // ** STANDARD GETTERS AND SETTERS ** 
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
