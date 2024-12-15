package com.r4ppz;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;
// import com.r4ppz.view.FileManagerView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.getIcons().add(imageLoader.loadImage("/com/r4ppz/image/white-circle-icon.png"));
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/com/r4ppz/view/LoginView.fxml"));
        mainStage.setTitle("Archive");
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show();
    }

}
