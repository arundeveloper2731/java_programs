package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

    @FXML
    private TextField display;
    double num1;
    String operator;
    CalculatorService service = new CalculatorService();    

    @FXML
    private void operator(ActionEvent event) {
         Button btn = (Button) event.getSource();
        num1 = Double.parseDouble(display.getText());
        operator = btn.getText();
        display.clear();
    }

    @FXML
    private void number(ActionEvent event) {
        Button btn = (Button) event.getSource();
        display.setText(display.getText() + btn.getText());
    }

    @FXML
    private void equal(ActionEvent event) 
    {
         double num2 = Double.parseDouble(display.getText());

        double result = service.performCalculation(num1, num2, operator);

        display.setText(String.valueOf(result));
    }

    @FXML
    private void clear(ActionEvent event)
    {
        display.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
     
    
}
