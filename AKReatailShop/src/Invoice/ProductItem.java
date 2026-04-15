package Invoice;

public class ProductItem {

    private String name;
    private int qty;
    private double rate;
    private double total;

    public ProductItem(String name, int qty, double rate) {
        this.name = name;
        this.qty = qty;
        this.rate = rate;
        this.total = qty * rate;
    }

    public String getName() { return name; }
    public int getQty() { return qty; }
    public double getRate() { return rate; }
    public double getTotal() { return total; }
}