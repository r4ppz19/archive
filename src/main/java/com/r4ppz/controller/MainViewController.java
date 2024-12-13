package com.r4ppz.controller;

import java.io.File;

import com.r4ppz.util.HandleFile;
import com.r4ppz.view.SuccessAlertView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainViewController {
    private SuccessAlertView successAlertView = SuccessAlertView.getInstanSuccessAlertView();


    @FXML
    private Button uploadButton;

    @FXML
    public void uploadButtonAction(ActionEvent actionEvent) throws Exception {
        HandleFile handleFile = HandleFile.getInstanceHandleFile();
        File selectedFile = handleFile.fileChooser((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());

        if (selectedFile != null) {
            handleFile.copyFileToProject(selectedFile, "src/main/resources/uploads");

            successAlertView.showSuccessAlertView();
        } else {
            System.out.println("File selection cancelled.");

        }
    }
}
