package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrollView {
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showTrollView() throws Exception {
        Stage TrollView = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/TrollView.fxml"));
        TrollView.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        TrollView.setScene(scene);
        TrollView.setResizable(false);
        TrollView.setTitle("Archive");
        TrollView.show();
    }
}
