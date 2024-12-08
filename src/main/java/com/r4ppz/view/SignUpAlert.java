package com.r4ppz.view;

import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignUpAlert {
    public void showSignUpView() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/SignUpAlert.fxml")));
        Stage signUpAlert = new Stage();
        Scene scene = new Scene(root);
        signUpAlert.setScene(scene);
        signUpAlert.setResizable(false);
        signUpAlert.initModality(Modality.APPLICATION_MODAL);
        signUpAlert.showAndWait();
    }
}
