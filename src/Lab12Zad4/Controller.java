package Lab12Zad4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtPassword;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblPhoneNumber;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblEmailAddress;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    private TextField txtConfirmPassword;

    @FXML
    private Button btnRegister;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        String userName=txtUsername.getText();
        String phoneNumber=txtPhoneNumber.getText();
        String emailAddress=txtEmailAddress.getText();
        String password=txtPassword.getText();
        String confirmedPassword=txtConfirmPassword.getText();

        lblUsername.setText("");
        lblPhoneNumber.setText("");
        lblEmailAddress.setText("");
        lblPassword.setText("");
        lblConfirmPassword.setText("");

        if(!userName.matches("[A-Za-z_\\d]{2,}"))
            lblUsername.setText("Please enter valid username.");

        if(!phoneNumber.matches("\\(\\d{4}\\)\\(\\d{7}\\)"))
            lblPhoneNumber.setText("Please enter valid phone number in the format  (9999)(9999999)");

        if(!emailAddress.matches("[\\dA-Za-z_.-]+\\@[a-z]+\\.[a-z]+"))
            lblEmailAddress.setText("Please enter valid email address.");

        if(!password.matches(".*"))
            lblPassword.setText("Please enter password.");

        if(!password.equals(confirmedPassword))
            lblConfirmPassword.setText("Passwords does NOT match.");
    }

}

