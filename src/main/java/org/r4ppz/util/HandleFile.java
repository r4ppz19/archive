package org.r4ppz.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HandleFile {
    private static HandleFile handleFile;

    private HandleFile() {

    }

    public static HandleFile getInstanceHandleFile() {
        if (handleFile == null) {
            handleFile = new HandleFile();
        }
        return handleFile;
    }


    public File fileChooser(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        return fileChooser.showOpenDialog(stage);
    }

    public void copyFileToProject(File sourceFile, String destinationPath) throws IOException {
        File destinationFile = new File(destinationPath, sourceFile.getName());
        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
