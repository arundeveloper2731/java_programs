package Payment;

public class Payment {

    private String billNo;
    private String customer;
    private String items;
    private String method;
    private double amount;
    private String time;
    private String status;

    public Payment(String billNo, String customer, String items,
                   String method, double amount, String time, String status) {
        this.billNo = billNo;
        this.customer = customer;
        this.items = items;
        this.method = method;
        this.amount = amount;
        this.time = time;
        this.status = status;
    }

    public String getBillNo() { return billNo; }
    public String getCustomer() { return customer; }
    public String getItems() { return items; }
    public String getMethod() { return method; }
    public double getAmount() { return amount; }
    public String getTime() { return time; }
    public String getStatus() { return status; }
}