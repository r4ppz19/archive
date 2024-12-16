package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorAlertView {
    private static ErrorAlertView errorAlertView;

    private ErrorAlertView() {

    }

    public static ErrorAlertView getInstancErrorAlertView() {
        if (errorAlertView == null) {
            errorAlertView = new ErrorAlertView();
        }

        return errorAlertView;
     }

    private final FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private final ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showErrorAlertView() throws Exception {
        Stage errorAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/com/r4ppz/view/ErrorAlert.fxml"));
        errorAlert.getIcons().add(imageLoader.loadImage("/com/r4ppz/image/white-circle-icon.png"));
        errorAlert.setScene(scene);
        errorAlert.setResizable(false);
        errorAlert.initModality(Modality.APPLICATION_MODAL);
        errorAlert.showAndWait();
    }
}
