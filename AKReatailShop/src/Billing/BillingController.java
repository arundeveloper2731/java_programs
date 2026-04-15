package Billing;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BillingController {

    @FXML private TextField txtCustomerName, txtPrice, txtQty;
    @FXML private ComboBox<String> cmbProduct;
    @FXML private TableView<CartItem> tblCart;

    @FXML private TableColumn<CartItem, String> colItem;
    @FXML private TableColumn<CartItem, Double> colPrice, colTotal;
    @FXML private TableColumn<CartItem, Integer> colQty;

    @FXML private Label lblSubtotal, lblTax, lblGrandTotal;

    private ObservableList<CartItem> cartData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // ✅ Correct field names
        colItem.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));

        tblCart.setItems(cartData);

        // Products list
        cmbProduct.setItems(FXCollections.observableArrayList(
                "iPhone 15 Pro", "Samsung S24 Ultra", "OnePlus 12", "Redmi Note 13"
        ));

        txtQty.setText("1"); // default
    }

    @FXML
    private void addToCart() {

        try {
            String item = cmbProduct.getValue();
            double price = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());

            // ✅ Correct constructor
            CartItem cartItem = new CartItem(item, price, qty);

            cartData.add(cartItem);

            calculateBill();

            // Clear inputs
            txtPrice.clear();
            txtQty.setText("1");

        } catch (Exception e) {
            showAlert("Error", "Please enter valid price and quantity");
        }
    }

    private void calculateBill() {

        double subtotal = cartData.stream()
                .mapToDouble(CartItem::getTotal)
                .sum();

        double tax = subtotal * 0.18;
        double grandTotal = subtotal + tax;

        lblSubtotal.setText(String.format("₹ %.2f", subtotal));
        lblTax.setText(String.format("₹ %.2f", tax));
        lblGrandTotal.setText(String.format("₹ %.2f", grandTotal));
    }

    // 🔔 Alert method
    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}