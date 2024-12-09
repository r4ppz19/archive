package com.r4ppz.controller;

import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SuccessAlertViewController {
    @FXML
    private Button okButton;

    @FXML
    public void okButtonAction(ActionEvent actionEvent) {
        // Get the statge and close it
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();

        
    }
}