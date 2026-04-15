package Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductManagementController {

    @FXML private Label totalProductsLabel;
    @FXML private TextField searchField; // FXML-la indha ID-ah search bar-ku kudukkavum
    @FXML private TableView<Product> productTable;
    @FXML private TableColumn<Product, String> nameCol;
    @FXML private TableColumn<Product, String> brandCol;
    @FXML private TableColumn<Product, Double> priceCol;
    @FXML private TableColumn<Product, Integer> stockCol;
    @FXML private TableColumn<Product, String> statusCol;

    // Main Data List
    private final ObservableList<Product> masterData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // 1. Setup Cell Value Factories
        nameCol.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        brandCol.setCellValueFactory(cellData -> cellData.getValue().brandProperty());
        priceCol.setCellValueFactory(cellData -> cellData.getValue().priceProperty().asObject());
        stockCol.setCellValueFactory(cellData -> cellData.getValue().stockProperty().asObject());

        // 2. Dynamic Status Column (Cell Factory)
        statusCol.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || getTableRow() == null || getTableRow().getItem() == null) {
                    setText(null);
                    setStyle("");
                } else {
                    int stock = getTableRow().getItem().getStock();
                    if (stock == 0) {
                        setText("Out of Stock");
                        setStyle("-fx-text-fill: #ef4444; -fx-font-weight: bold;");
                    } else if (stock < 5) {
                        setText("Low Stock");
                        setStyle("-fx-text-fill: #ff6b35; -fx-font-weight: bold;");
                    } else {
                        setText("In Stock");
                        setStyle("-fx-text-fill: #22c55e; -fx-font-weight: bold;");
                    }
                }
            }
        });

        // 3. Add Sample Data
        loadSampleData();

        // 4. Real-time Search Logic (The Efficient Way)
        FilteredList<Product> filteredData = new FilteredList<>(masterData, p -> true);

        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(product -> {
                if (newValue == null || newValue.isEmpty()) return true;
                
                String lowerCaseFilter = newValue.toLowerCase();
                if (product.getName().toLowerCase().contains(lowerCaseFilter)) return true;
                if (product.getBrand().toLowerCase().contains(lowerCaseFilter)) return true;
                return false; 
            });
            updateStats(filteredData.size());
        });

        // 5. Wrap FilteredList in a SortedList so sorting still works
        SortedList<Product> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(productTable.comparatorProperty());
        
        productTable.setItems(sortedData);
        updateStats(masterData.size());
    }

    private void updateStats(int count) {
        totalProductsLabel.setText(String.valueOf(count));
    }

    private void loadSampleData() {
        masterData.add(new Product("iPhone 15 Pro Max", "Apple", 134900, 3));
        masterData.add(new Product("Galaxy S24 Ultra", "Samsung", 124999, 12));
        masterData.add(new Product("OnePlus 12", "OnePlus", 64999, 0));
        masterData.add(new Product("Redmi Note 13", "Xiaomi", 24999, 25));
    }
}