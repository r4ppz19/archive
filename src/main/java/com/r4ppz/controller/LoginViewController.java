package com.r4ppz.controller;

import com.r4ppz.model.DefaultUser;
import com.r4ppz.model.UserModel;
import com.r4ppz.view.ErrorAlertView;
import com.r4ppz.view.TrollView;
import com.r4ppz.view.SuccessAlertView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {
    private UserModel userModel = new UserModel();
    private SuccessAlertView signUpAlertView = new SuccessAlertView();
    private DefaultUser defaultUser = new DefaultUser();
    private ErrorAlertView errorAlertView = new ErrorAlertView();
    private TrollView trollView = new TrollView();

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signInButton;
    @FXML
    private Button signUpButton;

    @FXML
    public void passwordTextFieldAction(ActionEvent actionEvent) throws Exception{
        signInAction(actionEvent);
    }

    @FXML
    public void usernameTextFieldAction(ActionEvent actionEvent) throws Exception {
        signInAction(actionEvent);
    }

    @FXML
    public void signInAction(ActionEvent actionEvent) throws Exception {

        if (usernameTextField.getText().equals(userModel.getUsername())
                && passwordTextField.getText().equals(userModel.getPassword())
                || usernameTextField.getText().equals(defaultUser.getUsername())
                && passwordTextField.getText().equals(defaultUser.getPassword())) {

            System.out.println("THE THE FUCK ???? WHO ARE YOU ??");

            // Get the statge and close it
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.close();

            trollView.showTrollView();
        } else {
            System.out.println("Nuh uhh");
            errorAlertView.showErrorAlertView();
        }

    }

    @FXML
    public void signUpAction(ActionEvent actionEvent) throws Exception {
        if (usernameTextField.getText() != null && !usernameTextField.getText().isEmpty()
                && passwordTextField.getText() != null && !passwordTextField.getText().isEmpty()) {
            userModel.setUsername(usernameTextField.getText());
            userModel.setPassword(passwordTextField.getText());
            signUpAlertView.showSignUpView();

            usernameTextField.clear();
            passwordTextField.clear();
        } else {
            System.out.println("What the fuck are you doing???");
            errorAlertView.showErrorAlertView();
        }

    }


}
