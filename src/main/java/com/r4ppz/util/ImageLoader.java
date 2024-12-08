package com.r4ppz.util;

import java.util.Objects;

import javafx.scene.image.Image;

public class ImageLoader {

    public Image loadImage(String imagePath) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
        return image;
    }
}
