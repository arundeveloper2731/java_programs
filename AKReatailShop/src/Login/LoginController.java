package Login;

import akreatailshop.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    
    @FXML
    private void handleLogin(ActionEvent event) {

        String username = usernameField.getText();
        String password = passwordField.getText();

        
        if (username.equals("admin") && password.equals("1234")) {

           
            Main.loadScene("/Dashboard/Dashboard.fxml", "Dashboard");

        } else {
            errorLabel.setText("Invalid Username or Password");
            errorLabel.setVisible(true);
        }
    }
    @FXML
private void goBack() {
    Main.goBack();
}

    
    @FXML
    private void handleSignup(ActionEvent event) {

        Main.loadScene("/signup/Signup.fxml", "Signup");
    }
}