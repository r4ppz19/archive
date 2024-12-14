package com.r4ppz.view;

import java.io.IOException;

import com.r4ppz.util.FxmlLoader;
import com.r4ppz.util.ImageLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FileManagerView {
    private static FileManagerView fileManagerView;

    private FileManagerView() {

    }

    public static FileManagerView getInstanceFileManagerView() {
        if (fileManagerView == null) {
            fileManagerView = new FileManagerView();
        }

        return fileManagerView;
    }

    FxmlLoader fxmlLoader = FxmlLoader.getInstanceFxmlLoader();
    ImageLoader imageLoader = ImageLoader.getInstanceImageLoader();
    public void showFileManagerView() throws IOException {
        Stage stage = new Stage();
        Parent root = fxmlLoader.fxmlLoader("/view/FileManagerView.fxml");
        stage.getIcons().add(imageLoader.loadImage("/image/white-circle-icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
