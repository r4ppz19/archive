package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView {
    private static MainView mainView;

    private MainView() {

    }

    public static MainView getInstancMainView() {
        if (mainView == null) {
            mainView = new MainView();
        }

        return mainView;
    }

    private final FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private final ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showMainView() throws Exception {
        Stage mainView = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/com/r4ppz/view/MainView.fxml"));
        mainView.getIcons().add(imageLoader.loadImage("/com/r4ppz/image/white-circle-icon.png"));
        mainView.setScene(scene);
        mainView.setResizable(false);
        mainView.setTitle("Archive");
        mainView.show();
    }
}
