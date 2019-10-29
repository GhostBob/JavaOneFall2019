package javaonefinal.people;

public class HourlyEmployee extends Employee {
    
    public static final double STARTINGRATE = 10.75;
    
    private double hourlyRate;
    
    
    public HourlyEmployee(double hourlyRate, long employeeId, int storeNumber, String name, int age) {
        super(employeeId, storeNumber, name, age);
        this.hourlyRate = hourlyRate;
    }
    
    public HourlyEmployee(long employeeId, int storeNumber, String name, int age) {
        this(HourlyEmployee.STARTINGRATE, employeeId, storeNumber, name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourly Rate: " + this.hourlyRate;
    }
    
    // ** Standard getters and setters.

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
