package Settings;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SettingsController {

    // Store Fields
    @FXML private TextField storeName;
    @FXML private TextField gst;
    @FXML private TextField phone;
    @FXML private TextField email;
    @FXML private TextField address;

    // Billing
    @FXML private CheckBox autoPrint;
    @FXML private CheckBox whatsapp;
    @FXML private CheckBox gstBreak;
    @FXML private CheckBox loyalty;

    // System
    @FXML private CheckBox darkMode;
    @FXML private CheckBox backup;
    @FXML private CheckBox twoFactor;

    // Staff
    @FXML private ListView<String> staffList;

    // 🔹 Initialize
    @FXML
    public void initialize() {

        if (staffList != null) {
            staffList.getItems().addAll(
                    "Ramesh Kumar - Manager",
                    "Anitha - Sales",
                    "Selvam - Cashier"
            );
        }

        if (autoPrint != null) autoPrint.setSelected(true);
        if (whatsapp != null) whatsapp.setSelected(true);
        if (backup != null) backup.setSelected(true);
    }

    // 🔹 Save All
    @FXML
    private void handleSaveAll() {
        showAlert("All settings saved successfully ✅");
    }

    // 🔹 Save Store
    @FXML
    private void handleSaveStore() {

        if (storeName.getText().isEmpty()) {
            showAlert("Store name is required ❌");
            return;
        }

        showAlert("Store details saved successfully ✅");
    }

    // 🔹 Add Staff
    @FXML
    private void handleAddStaff() {
        staffList.getItems().add("New Staff - Role");
    }

    // 🔹 Alert
    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Settings");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}