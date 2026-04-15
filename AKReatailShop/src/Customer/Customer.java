package Customer;

public class Customer {

    private String name;
    private String phone;
    private String tier;
    private double spent;
    private int purchases;
    private String address;
    private String notes;

    public Customer(String name, String phone, String tier, double spent,
                    int purchases, String address, String notes) {
        this.name = name;
        this.phone = phone;
        this.tier = tier;
        this.spent = spent;
        this.purchases = purchases;
        this.address = address;
        this.notes = notes;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getTier() { return tier; }
    public double getSpent() { return spent; }
    public int getPurchases() { return purchases; }
    public String getAddress() { return address; }
    public String getNotes() { return notes; }
}