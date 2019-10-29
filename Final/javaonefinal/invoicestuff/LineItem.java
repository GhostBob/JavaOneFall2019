package javaonefinal.invoicestuff;

public class LineItem {
    private int id;
    private String description;
    private int quantity;
    private double pricePerItem;

    public LineItem(int id, String description, int quantity, double pricePerItem) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return id + ": " + description + "\n" + "Qty: " + quantity 
                + "\n" + "Price Per: " + pricePerItem + "\n";
    }
    
    // ** Standard getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    
}
