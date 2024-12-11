package com.r4ppz.util;

import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FxmlLoader {

    // Private static instance variable of FxmlLoader
    private static FxmlLoader fxmlLoader;
    // Private constructor to prevent instantiation
    private FxmlLoader() {
    }

    // Public static method to get the single instance of FxmlLoader class
    public static FxmlLoader getInstanceFxmlLoader() {
        if (fxmlLoader == null) {
            fxmlLoader = new FxmlLoader();
        }

        return fxmlLoader;
    }

    public Parent fxmlLoader(String fxmlPath) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlPath)));
        return root;
    }
}
