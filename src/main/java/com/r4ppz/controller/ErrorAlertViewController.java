package com.r4ppz.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorAlertViewController {

    @FXML
    public void okButtonAction(ActionEvent actionEvent) {
        // Get the stage and close it
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
