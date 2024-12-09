package com.r4ppz.controller;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {
    private int width = 400;
    private int hight = 200;

    Random random = new Random();

    @FXML
    public void initialize() {
        fuckYouButton.setOnMouseEntered(event -> moveButton());
    }

    @FXML
    private Button fuckYouButton;
    
    @FXML
    public void fuckYouButtonAction(ActionEvent actionEvent) {
        
    }

    public void moveButton() {
        int x = random.nextInt(width + 1);
        int y = random.nextInt(hight + 1);
        fuckYouButton.setLayoutX(x);
        fuckYouButton.setLayoutY(y);
    }
}
