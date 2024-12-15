package com.r4ppz;

import com.r4ppz.util.ImageLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class WindowTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/r4ppz/view/MainView.fxml")));
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(imageLoader.loadImage("/com/r4ppz/image/white-circle-icon.png"));
        primaryStage.setTitle("Main View Test");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
