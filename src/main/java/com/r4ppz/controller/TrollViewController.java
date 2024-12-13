package com.r4ppz.controller;

import java.util.Random;

import com.r4ppz.view.MainView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TrollViewController {
    private int width = 600;
    private int hight = 400;

    private MainView mainView = MainView.getInstancMainView();

    Random random = new Random();

    @FXML
    public void initialize() {
        clickMeButton.setOnMouseEntered(event -> moveButton());
    }

    @FXML
    private Button clickMeButton;
    
    @FXML
    public void clickMeButtonAction(ActionEvent actionEvent) throws Exception {
        // Get the statge and close it
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();

        System.out.println("FUCK YOO BITCH!");
        mainView.showMainView();
    }

    public void moveButton() {
        int x = random.nextInt(width - 200);
        int y = random.nextInt(hight - 200);
        clickMeButton.setLayoutX(x);
        clickMeButton.setLayoutY(y);
    }
}
