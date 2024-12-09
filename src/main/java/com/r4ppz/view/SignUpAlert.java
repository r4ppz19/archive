package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignUpAlert {
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showSignUpView() throws Exception {
        Stage signUpAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/SignUpAlert.fxml"));
        signUpAlert.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        signUpAlert.setScene(scene);
        signUpAlert.setResizable(false);
        signUpAlert.initModality(Modality.APPLICATION_MODAL);
        signUpAlert.showAndWait();
    }
}
