package javaonefinal.people;

public class CommissionEmployee extends Employee {
    
    public static final double STARTING_COMMISSION = 0.10;
    public static final double STARTING_RATE = 2.50;
    
    private static double allEmployeesTotalCommission = 0;
    
    private double baseRate;
    private double salePercentage;

    public CommissionEmployee(double baseRate, double salePercentage, long EmployeeId, int storeNumber, String name, int age) {
        super(EmployeeId, storeNumber, name, age);
        this.baseRate = baseRate;
        this.salePercentage = salePercentage;
    }

    public CommissionEmployee(long employeeId, int storeNumber, String name, int age) {
        this(STARTING_RATE, STARTING_COMMISSION, employeeId, storeNumber, name, age);
    }
    
    public static void addToTotalCommission(double amount) {
        allEmployeesTotalCommission += amount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Rate: " + this.baseRate + 
                "\nCommission: " + this.salePercentage;
    }
    
    
    // ** Standard getters and setters.

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(double salePercentage) {
        this.salePercentage = salePercentage;
    }
    
    public static double getAllEmployeesTotalCommission() {
        return allEmployeesTotalCommission;
    }
}
