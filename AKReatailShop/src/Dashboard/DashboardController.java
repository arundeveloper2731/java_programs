package Dashboard;

import akreatailshop.Main;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML private AreaChart<String, Number> revenueChart;
    @FXML private Label revenueLabel;

    // 🔹 INITIAL LOAD
    @FXML
    public void initialize() {

        // Set revenue value
        revenueLabel.setText("₹1,84,200");

        // Chart data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Revenue");

        series.getData().add(new XYChart.Data<>("Jan", 50000));
        series.getData().add(new XYChart.Data<>("Feb", 80000));
        series.getData().add(new XYChart.Data<>("Mar", 65000));
        series.getData().add(new XYChart.Data<>("Apr", 120000));

        revenueChart.getData().add(series);
    }

    // 📦 NAVIGATION
    @FXML
    private void goToProducts() {
        Main.loadScene("Product/Product.fxml", "Products");
    }

    // 🚪 LOGOUT
    @FXML
    private void handleLogout() {

        System.out.println("User Logged Out");

        // Go back to Login screen
        Main.loadScene("/Login/Login.fxml", "Login");
    }
}