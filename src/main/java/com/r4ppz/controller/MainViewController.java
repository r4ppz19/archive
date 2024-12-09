package com.r4ppz.controller;

import com.r4ppz.model.UserModel;
import com.r4ppz.view.SignInAlert;
import com.r4ppz.view.SignUpAlert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainViewController {
    private UserModel userModel = new UserModel();
    private SignUpAlert signUpAlert = new SignUpAlert();
    private SignInAlert signInAlert = new SignInAlert();

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
            signInAlert.showSignInView();
        } else {
            System.out.println("Maybe enter user n pass, you fucking idiot");
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
        }

    }
}
