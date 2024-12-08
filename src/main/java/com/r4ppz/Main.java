package com.r4ppz;

import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        Image imageIcon = new Image(Objects.requireNonNull(getClass().getResource("/image/r4ppz-logo.png")).toString());
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/LoginView.fxml")));
        Scene scene = new Scene(root);
        mainStage.getIcons().add(imageIcon);
        mainStage.setTitle("Archive");
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show();
    }


}
