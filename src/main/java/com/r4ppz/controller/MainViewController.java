package com.r4ppz.controller;

import java.io.File;

import com.r4ppz.util.HandleFile;
import com.r4ppz.view.SuccessAlertView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController {

    @FXML
    private Button uploadButton;
    @FXML
    private VBox fileContainer;

    @FXML
    public void initialize() {
        refresh();
    }



    @FXML
    public void uploadButtonAction(ActionEvent actionEvent) throws Exception {
        HandleFile handleFile = HandleFile.getInstanceHandleFile();
        File selectedFile = handleFile.fileChooser((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());

        if (selectedFile != null) {
            handleFile.copyFileToProject(selectedFile, "src/main/resources/com/r4ppz/uploads");

            SuccessAlertView successAlertView = SuccessAlertView.getInstanSuccessAlertView();
            successAlertView.showSuccessAlertView();

            initialize();
        } else {
            System.out.println("File selection cancelled.");

        }
    }

    private void refresh() {
        fileContainer.getChildren().clear();

        File directory = new File("src/main/resources/com/r4ppz/uploads/");
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                VBox fileBox = new VBox();
                fileBox.getStyleClass().add("file-box");

                Label fileNameLabel = new Label(file.getName());
                fileBox.getChildren().add(fileNameLabel);

                fileContainer.getChildren().add(fileBox);
            }
        } else {
            System.out.println("Directory not found: " + directory.getAbsolutePath());
        }
    }
}
