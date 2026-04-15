package Product;

import javafx.beans.property.*;

public class Product {
    private final StringProperty name;
    private final StringProperty brand;
    private final DoubleProperty price;
    private final IntegerProperty stock;

    public Product(String name, String brand, double price, int stock) {
        this.name = new SimpleStringProperty(name);
        this.brand = new SimpleStringProperty(brand);
        this.price = new SimpleDoubleProperty(price);
        this.stock = new SimpleIntegerProperty(stock);
    }

    public String getName() { return name.get(); }
    public String getBrand() { return brand.get(); }
    public double getPrice() { return price.get(); }
    public int getStock() { return stock.get(); }
    
    // Properties (for TableView binding)
    public StringProperty nameProperty() { return name; }
    public StringProperty brandProperty() { return brand; }
    public DoubleProperty priceProperty() { return price; }
    public IntegerProperty stockProperty() { return stock; }
}