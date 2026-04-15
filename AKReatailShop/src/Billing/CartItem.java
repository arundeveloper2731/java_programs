package Billing;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;
    private double total;

    // 🔹 Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    // 🔹 Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    // 🔹 Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
        calculateTotal();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateTotal();
    }

    // 🔄 Auto calculate total
    private void calculateTotal() {
        this.total = this.price * this.quantity;
    }
}