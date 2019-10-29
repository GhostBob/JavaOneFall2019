package javaonefinal.people;

public class Employee extends Person {
    
    protected long employeeId;
    protected int storeNumber;

    public Employee(long employeeId, int storeNumber, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
        this.storeNumber = storeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + this.employeeId;
    }
    
    // ** Standard getters and setters.

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long EmployeeId) {
        this.employeeId = EmployeeId;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }
}
