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
    private Button number;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private TextField display;

    double num1 = 0;
    String operator = "";

    @FXML
    void number(ActionEvent event) {
        Button btn = (Button) event.getSource();
        display.setText(display.getText() + btn.getText());
    }

    @FXML
    void operator(ActionEvent event) {
        Button btn = (Button) event.getSource();
        num1 = Double.parseDouble(display.getText());
        operator = btn.getText();
        display.clear();
    }

    @FXML
    void equal(ActionEvent event) {

        double num2 = Double.parseDouble(display.getText());
        double result = 0;

        switch(operator){
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
        }

        display.setText(String.valueOf(result));
    }

    @FXML
    void clear(ActionEvent event) {
        display.clear();
    }
    
}
