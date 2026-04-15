package SalesAnalysis;

public class Sales {

    private String date;
    private String customer;
    private String product;
    private double amount;

    public Sales(String date, String customer, String product, double amount) {
        this.date = date;
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public String getDate() { return date; }
    public String getCustomer() { return customer; }
    public String getProduct() { return product; }
    public double getAmount() { return amount; }
}