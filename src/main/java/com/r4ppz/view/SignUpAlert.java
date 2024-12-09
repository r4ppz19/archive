package com.r4ppz.view;

import com.r4ppz.Main;
import com.r4ppz.util.FxmlLoader;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignUpAlert {
    // Create instance of the Main class to access the util classes instances methods
    FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();


    public void showSignUpView() throws Exception {
        Stage signUpAlert = new Stage();
        Scene scene = new Scene(fxmlLoader.fxmlLoader("/view/SignUpAlert.fxml"));
        signUpAlert.getIcons().add(main.imageLoader.loadImage("/image/white-circle-icon.png"));
        signUpAlert.setScene(scene);
        signUpAlert.setResizable(false);
        signUpAlert.initModality(Modality.APPLICATION_MODAL);
        signUpAlert.showAndWait();
    }
}
