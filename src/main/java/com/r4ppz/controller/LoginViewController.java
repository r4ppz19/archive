package com.r4ppz.controller;

import com.r4ppz.model.DefaultUser;
import com.r4ppz.model.UserModel;
import com.r4ppz.view.ErrorAlert;
import com.r4ppz.view.SuccessAlert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController {
    private UserModel userModel = new UserModel();
    private SuccessAlert signUpAlert = new SuccessAlert();
    private DefaultUser defaultUser = new DefaultUser();
    private ErrorAlert errorAlert = new ErrorAlert();

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signInButton;
    @FXML
    private Button signUpButton;

    @FXML
    public void signInAction(ActionEvent actionEvent) throws Exception {
        
        if (usernameTextField.getText().equals(userModel.getUsername()) && passwordTextField.getText().equals(userModel.getPassword())) {
        } else if (usernameTextField.getText().equals(defaultUser.getUsername()) && passwordTextField.getText().equals(defaultUser.getPassword())) {
            System.out.println("THE THE FUCK ???? WHO ARE YOU ??");
        } else {
            System.out.println("Nuh uhh");
        }
        
    }

    @FXML
    public void signUpAction(ActionEvent actionEvent) throws Exception {
        if (usernameTextField.getText() != null && !usernameTextField.getText().isEmpty()
                && passwordTextField.getText() != null && !passwordTextField.getText().isEmpty()) {
            userModel.setUsername(usernameTextField.getText());
            userModel.setPassword(passwordTextField.getText());
            signUpAlert.showSignUpView();

            usernameTextField.clear();
            passwordTextField.clear();
        } else {
            System.out.println("What the fuck are you doing???");
            errorAlert.showErrorAlertView();
        }

    }
}
