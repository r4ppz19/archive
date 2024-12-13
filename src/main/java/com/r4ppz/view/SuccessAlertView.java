package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SuccessAlertView {
    private static SuccessAlertView successAlertView;

    private SuccessAlertView() {

    }

    public static SuccessAlertView getInstanSuccessAlertView() {
        if (successAlertView == null) {
            successAlertView = new SuccessAlertView();
        }

        return successAlertView;
    }

    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showSuccessAlertView() throws Exception {
        Stage successAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/SuccessAlert.fxml"));
        successAlert.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        successAlert.setScene(scene);
        successAlert.setResizable(false);
        successAlert.initModality(Modality.APPLICATION_MODAL);
        successAlert.showAndWait();
    }
}
