package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView {
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showMainView() throws Exception {
        Stage mainView = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/MainView.fxml"));
        mainView.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        mainView.setScene(scene);
        mainView.setResizable(false);
        mainView.setTitle("Archive");
        mainView.show();
    }
}
