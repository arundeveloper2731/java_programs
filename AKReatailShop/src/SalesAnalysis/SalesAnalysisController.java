package SalesAnalysis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class SalesAnalysisController implements Initializable {

    @FXML
    private TableView<Sales> salesTable;

    @FXML
    private TableColumn<Sales, String> dateCol;

    @FXML
    private TableColumn<Sales, String> customerCol;

    @FXML
    private TableColumn<Sales, String> productCol;

    @FXML
    private TableColumn<Sales, Double> amountCol;

    @FXML
    private Label revenueLabel;

    @FXML
    private Label ordersLabel;

    // 🔌 DB Connection Method
    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/mobile_shop";
        String user = "root";
        String password = "root"; // change if needed

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("DB Connection Failed");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // 📊 Table Column Mapping
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customer"));
        productCol.setCellValueFactory(new PropertyValueFactory<>("product"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // Load data
        loadSalesData();
    }

    // 📥 Load Data from DB
    private void loadSalesData() {

        ObservableList<Sales> list = FXCollections.observableArrayList();

        double totalRevenue = 0;
        int totalOrders = 0;

        String query = "SELECT * FROM sales";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                Sales sale = new Sales(
                        rs.getString("date"),
                        rs.getString("customer"),
                        rs.getString("product"),
                        rs.getDouble("amount")
                );

                list.add(sale);

                totalRevenue += rs.getDouble("amount");
                totalOrders++;
            }

            // 📌 Set data to table
            salesTable.setItems(list);

            // 📌 Update labels
            revenueLabel.setText("₹" + totalRevenue);
            ordersLabel.setText(String.valueOf(totalOrders));

        } catch (Exception e) {
            System.out.println("Error loading data");
            e.printStackTrace();
        }
    }
}