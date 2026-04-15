package Invoice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class InvoiceController implements Initializable {

    // 🔹 FXML Fields
    @FXML private TextField invoiceNumField;
    @FXML private DatePicker datePicker;
    @FXML private TextArea remarksArea;

    @FXML private TextField courierNameField;
    @FXML private TextField awbField;

    @FXML private TableView<ProductItem> productsTable;
    @FXML private TableColumn<ProductItem, String> nameCol;
    @FXML private TableColumn<ProductItem, Integer> qtyCol;
    @FXML private TableColumn<ProductItem, Double> rateCol;
    @FXML private TableColumn<ProductItem, Double> totalCol;

    @FXML private Label grandTotalLabel;

    // 🔹 Data List
    private ObservableList<ProductItem> productList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Set current date
        datePicker.setValue(LocalDate.now());

        // Table Mapping
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        qtyCol.setCellValueFactory(new PropertyValueFactory<>("qty"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        totalCol.setCellValueFactory(new PropertyValueFactory<>("total"));

        productsTable.setItems(productList);
    }

    // ➕ ADD PRODUCT (Demo)
    @FXML
    private void handleAddProduct() {

        // Demo data (later dialog box la input edukalam)
        ProductItem item = new ProductItem("iPhone 13", 1, 65000);

        productList.add(item);

        calculateTotal();
    }

    // 💰 CALCULATE TOTAL
    private void calculateTotal() {

        double total = 0;

        for (ProductItem item : productList) {
            total += item.getTotal();
        }

        grandTotalLabel.setText("₹ " + String.format("%.2f", total));
    }

    // ✅ SUBMIT
    @FXML
    private void handleSubmit() {

        String invoiceNo = invoiceNumField.getText();
        LocalDate date = datePicker.getValue();
        String remarks = remarksArea.getText();

        String courier = courierNameField.getText();
        String tracking = awbField.getText();

        if (invoiceNo.isEmpty() || date == null) {
            showAlert("Error", "Invoice number & date required!");
            return;
        }

        // 👉 For now just print (later DB save pannalam)
        System.out.println("Invoice: " + invoiceNo);
        System.out.println("Date: " + date);
        System.out.println("Courier: " + courier);
        System.out.println("Tracking: " + tracking);

        for (ProductItem item : productList) {
            System.out.println(item.getName() + " - " + item.getQty());
        }

        showAlert("Success", "Stock Saved Successfully!");
        clearForm();
    }

    // 🔄 CLEAR FORM
    private void clearForm() {
        productList.clear();
        grandTotalLabel.setText("₹ 0.00");
        remarksArea.clear();
        courierNameField.clear();
        awbField.clear();
    }

    // ⚠️ ALERT
    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}