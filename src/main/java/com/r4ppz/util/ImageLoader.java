package com.r4ppz.util;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

import javafx.scene.image.Image;

public class ImageLoader {

    // Cache to store loaded iamges
    private Map<String, Image> imageCache = new HashMap<>();

    public Image loadImage(String imagePath) {

        // Check if the image is already in the cache
        if (imageCache.containsKey(imagePath)) {
            return imageCache.get(imagePath);
        }

        // Load the image from the disk
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
        // Stores the loaded image in the cache
        imageCache.put(imagePath, image);

        return image;
    }
}
