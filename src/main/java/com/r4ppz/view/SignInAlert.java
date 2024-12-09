package com.r4ppz.view;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignInAlert {
    private FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    private ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();

    public void showSignInView() throws Exception {
        Stage signInAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/SignInAlert.fxml"));
        signInAlert.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        signInAlert.setScene(scene);
        signInAlert.setResizable(false);
        signInAlert.initModality(Modality.APPLICATION_MODAL);
        signInAlert.showAndWait();
    }
}
