package com.r4ppz.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.File;

public class FileManagerController {
    @FXML
    private ListView<String> fileListView;

    @FXML
    public void initialize() {
        File directory = new File("src/main/resources/uploads/");
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                fileListView.getItems().add(file.getName());
            }
        } else {
            System.out.println("Fuck you");
        }
    }
}
