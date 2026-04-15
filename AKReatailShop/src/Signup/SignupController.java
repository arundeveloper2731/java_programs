package Signup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SignupController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField mobileField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private ComboBox roleBox;

    @FXML
    private CheckBox termsCheck;

    @FXML
    private Button createAccountBtn;

    @FXML
    private void handleLogin(ActionEvent event) {

        System.out.println("Signup Button Clicked");

        String firstName = firstNameField.getText();
        String mobile = mobileField.getText();

        System.out.println(firstName);
        System.out.println(mobile);
    }
    

    @FXML
    private void handleSignup(ActionEvent event) {

        System.out.println("Signup button clicked");

    }

    @FXML
    private void openLogin(ActionEvent event) {

        System.out.println("Go to Login Page");

    }


}