package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorAlertView {
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showErrorAlertView() throws Exception {
        Stage errorAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/ErrorAlert.fxml"));
        errorAlert.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        errorAlert.setScene(scene);
        errorAlert.setResizable(false);
        errorAlert.initModality(Modality.APPLICATION_MODAL);
        errorAlert.showAndWait();
    }
}
