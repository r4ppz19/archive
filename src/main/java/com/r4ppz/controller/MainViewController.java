package com.r4ppz.controller;

import java.io.File;

import com.r4ppz.util.HandleFile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainViewController {
    @FXML
    private Button uploadButton;

    @FXML
    public void uploadButtonAction(ActionEvent actionEvent) throws Exception{
        HandleFile handleFile = HandleFile.getInstanceHandleFile();
        File selectedFile = handleFile.fileChooser((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());

        if (selectedFile != null) {
            handleFile.copyFileToProject(selectedFile, "src/main/resources/uploads");
            System.out.println("File uploaded successfully.");
        } else {
            System.out.println("File selection cancelled.");
        }
    }
}
