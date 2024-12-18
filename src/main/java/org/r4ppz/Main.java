package org.r4ppz;

import org.r4ppz.util.FxmlLoader;
import org.r4ppz.util.ImageLoader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private final ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();
    private final FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.getIcons().add(imageLoader.loadImage("/org/r4ppz/image/white-circle-icon.png"));
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/org/r4ppz/view/LoginView.fxml"));
        mainStage.setTitle("Archive");
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show();
    }

}
