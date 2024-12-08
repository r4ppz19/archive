package com.r4ppz.controller;

import com.r4ppz.model.UserPassModel;
import com.r4ppz.view.SignUpAlert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainViewController {
    private UserPassModel userPassModel = new UserPassModel();
    private SignUpAlert signUpAlert = new SignUpAlert();

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signInButton;
    @FXML
    private Button signUpButton;

    @FXML
    public void signInAction(ActionEvent actionEvent) {
        System.out.println(userPassModel.getUsername());
        System.out.println(userPassModel.getPassword());
    }

    @FXML
    public void signUpAction(ActionEvent actionEvent) throws Exception {
        userPassModel.setUsername(usernameTextField.getText());
        userPassModel.setPassword(passwordTextField.getText());
        signUpAlert.showSignUpView();
    }
}
