package com.r4ppz.util;

import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FxmlLoader {

    private static FxmlLoader fxmlLoader;
    
    private FxmlLoader() {
    }

    public static FxmlLoader getInstanceFxmlLoader() {
        if (fxmlLoader == null) {
            fxmlLoader = new FxmlLoader();
        }

        return fxmlLoader;
    }

    public Parent fxmlLoader(String fxmlPath) throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlPath)));
    }
}
