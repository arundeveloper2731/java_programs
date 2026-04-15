/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Reports;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class ReportsController {

    @FXML
    private VBox reportListContainer;

    @FXML
    private BarChart<String, Number> revenueChart;

    // 🔹 AUTO LOAD
    @FXML
    public void initialize() {

        loadChartData();
    }

    // 🔹 LOAD CHART DATA
    private void loadChartData() {

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Revenue 2026");

        series.getData().add(new XYChart.Data<>("Jan", 50000));
        series.getData().add(new XYChart.Data<>("Feb", 65000));
        series.getData().add(new XYChart.Data<>("Mar", 70000));
        series.getData().add(new XYChart.Data<>("Apr", 85000));
        series.getData().add(new XYChart.Data<>("May", 90000));
        series.getData().add(new XYChart.Data<>("Jun", 95000));

        revenueChart.getData().add(series);
    }

    // 🔹 GENERATE ALL REPORTS
    @FXML
    private void handleGenerateAll() {
        showAlert("All Reports Generated ✅");
    }

    // 🔹 SINGLE REPORT BUTTON
    @FXML
    private void handleReportAction() {
        showAlert("Report Generated 📊");
    }

    // 🔹 COMMON ALERT METHOD
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reports");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}