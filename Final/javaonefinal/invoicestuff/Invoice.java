package javaonefinal.invoicestuff;

import java.text.DecimalFormat;
import javaonefinal.people.*;

public class Invoice {
    private final LineItem[] lineItems;
    private Person customer;
    private Employee employee;
    
    public Invoice(Person customer, Employee employee) {
        this.lineItems = new LineItem[100];
        this.customer = customer;
        this.employee = employee;
    }
    
    public void addLineItem(LineItem item) {
        //Another way to add to the running total of Commission, probably better than doing it in print
//        if (this.employee instanceof CommissionEmployee) {
//            CommissionEmployee ce = (CommissionEmployee)this.employee;
//            CommissionEmployee.addToTotalCommission(item.getPricePerItem() * item.getQuantity() * ce.getSalePercentage());
//        }
        
        for (int i=0; i<this.lineItems.length; ++i) {
            if (this.lineItems[i] == null) {
                this.lineItems[i] = item;
                return;
            }
        }
        System.out.println("** Error ** LineItems is full, item not added!");
    }
    
    public void print() {
        System.out.println("Customer: " + this.customer.getName());
        System.out.println("Employee: " + this.employee.getName() + "   ID: " 
                + this.employee.getEmployeeId());
        System.out.println("");
        System.out.println("Line Items: ");
        System.out.println("-----------");
        double due = 0;
        for (LineItem item : this.lineItems) {
            if (item == null)
                break;
            
            due += item.getPricePerItem() * item.getQuantity();
            System.out.println(item);
        }
        System.out.println("-----------");
        
        DecimalFormat format = new DecimalFormat("##.00");
        double tax = due * 0.0825;
        System.out.println("Pre-Tax: " + due);
        System.out.println("Tax: " + format.format(tax));
        System.out.println("Total Due: " + format.format(due + tax));
        
        if (this.employee instanceof CommissionEmployee) {
            CommissionEmployee commish = (CommissionEmployee)this.employee;
            System.out.println("\n");
            double commission = due * commish.getSalePercentage();
            CommissionEmployee.addToTotalCommission(commission);
            System.out.println("Commission Earned: " + format.format(commission));
        }
    }
    
    // ** Standard Getters and Setters

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }    
}
