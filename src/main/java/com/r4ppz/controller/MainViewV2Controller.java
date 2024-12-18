package com.r4ppz.controller;

import java.io.File;

import com.r4ppz.util.HandleFile;
import com.r4ppz.util.ImageLoader;
import com.r4ppz.view.SuccessAlertView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewV2Controller {
    @FXML
    private Button uploadButton;

    @FXML
    private VBox fileContainer;

    @FXML
    public void initialize() {
        refresh();
    }

    @FXML
    public void uploadButtonAction(ActionEvent actionEvent) throws Exception{
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
        loadFilesToButton();
    }

    private void loadFilesToButton() {
        File directory = new File("src/main/resources/com/r4ppz/uploads/");
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                String fileName = file.getName();
                Button folderContainerButton = new Button(file.getName());

                ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();
                Image folderImage = imageLoader.loadImage("/com/r4ppz/image/folder-icon.png");
                
                ImageView folderIcon = new ImageView(folderImage);
                folderIcon.setFitHeight(25);
                folderIcon.setFitWidth(25);
                folderContainerButton.setGraphic(folderIcon);
                folderContainerButton.getStyleClass().add("content-folder-button");
                folderContainerButton.setContentDisplay(ContentDisplay.LEFT);

                Tooltip FileNametooltip = new Tooltip(fileName);
                folderContainerButton.setTooltip(FileNametooltip);

                fileContainer.getChildren().add(folderContainerButton);
            }
        } else {
            System.out.println("Directory not found: " + directory.getAbsolutePath());
        }
    }
}
