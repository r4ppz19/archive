package com.r4ppz.controller;

import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SignUpViewController {
    @FXML
    private Button okButton;

    @FXML
    public void okButtonAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
