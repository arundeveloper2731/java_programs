package Payment;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PaymentController {

    @FXML private TableView<Payment> tblPayments;

    @FXML private TableColumn<Payment, String> colBill;
    @FXML private TableColumn<Payment, String> colCustomer;
    @FXML private TableColumn<Payment, String> colItems;
    @FXML private TableColumn<Payment, String> colMethod;
    @FXML private TableColumn<Payment, Double> colAmount;
    @FXML private TableColumn<Payment, String> colTime;
    @FXML private TableColumn<Payment, String> colStatus;

    private ObservableList<Payment> data = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colBill.setCellValueFactory(new PropertyValueFactory<>("billNo"));
        colCustomer.setCellValueFactory(new PropertyValueFactory<>("customer"));
        colItems.setCellValueFactory(new PropertyValueFactory<>("items"));
        colMethod.setCellValueFactory(new PropertyValueFactory<>("method"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Sample Data
        data.add(new Payment("INV-001", "Arjun", "3 items", "Cash", 215678, "10:42 AM", "Paid"));
        data.add(new Payment("INV-002", "Priya", "1 item", "UPI", 44900, "9:18 AM", "Paid"));
        data.add(new Payment("INV-003", "Karthik", "2 items", "Card", 13420, "8:55 AM", "Paid"));
        data.add(new Payment("INV-004", "Muthu", "1 item", "Cash", 7500, "28 Mar", "Pending"));

        tblPayments.setItems(data);
    }

    @FXML
    private void handleAddPayment() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Payment");
        alert.setHeaderText(null);
        alert.setContentText("Record Payment Clicked");
        alert.showAndWait();
    }
}