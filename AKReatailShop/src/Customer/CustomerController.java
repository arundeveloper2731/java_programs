package Customer;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomerController {

    // 🔹 TABLE
    @FXML private TableView<Customer> tblCustomers;
    @FXML private TableColumn<Customer, String> colName;
    @FXML private TableColumn<Customer, String> colPhone;
    @FXML private TableColumn<Customer, String> colTier;
    @FXML private TableColumn<Customer, Double> colSpent;

    // 🔹 DETAIL PANEL
    @FXML private Label detailPanel;
    @FXML private Label lblInitials, lblName, lblPhone, lblTierBadge;
    @FXML private Label lblSpentDetail, lblPurchases, lblAddress, lblNotes;
    @FXML private ProgressBar progTier;

    private ObservableList<Customer> customerList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // ✅ Table Mapping
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colTier.setCellValueFactory(new PropertyValueFactory<>("tier"));
        colSpent.setCellValueFactory(new PropertyValueFactory<>("spent"));

        // ✅ Sample Data
        customerList.addAll(
            new Customer("Arun Kumar", "9876543210", "Gold", 284200, 14, "Anna Nagar, Madurai", "Prefers UPI"),
            new Customer("Rahul", "9123456780", "Silver", 120000, 6, "KK Nagar", "Cash customer"),
            new Customer("Priya", "9000000000", "Platinum", 500000, 25, "Chennai", "VIP customer")
        );

        tblCustomers.setItems(customerList);
    }

    // 🔹 ROW CLICK
    @FXML
    private void handleRowClick() {

        Customer selected = tblCustomers.getSelectionModel().getSelectedItem();

        if (selected != null) {

            detailPanel.setVisible(true);

            lblName.setText(selected.getName());
            lblPhone.setText(selected.getPhone());
            lblTierBadge.setText("★ " + selected.getTier().toUpperCase());

            lblSpentDetail.setText("₹ " + selected.getSpent());
            lblPurchases.setText(String.valueOf(selected.getPurchases()));
            lblAddress.setText(selected.getAddress());
            lblNotes.setText(selected.getNotes());

            // Initials
            String initials = selected.getName().substring(0, 2).toUpperCase();
            lblInitials.setText(initials);

            // Progress dummy
            progTier.setProgress(0.5);
        }
    }

    // 🔹 ADD CUSTOMER
    @FXML
    private void handleAddCustomer() {
        System.out.println("Add Customer Clicked");
        // open popup or new screen later
    }

    // 🔹 BILL
    @FXML
    private void handleNewBill() {
        System.out.println("New Bill for Customer");
    }

    // 🔹 WHATSAPP
    @FXML
    private void handleWhatsapp() {
        System.out.println("Open WhatsApp");
    }
}