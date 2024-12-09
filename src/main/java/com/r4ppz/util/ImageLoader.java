package com.r4ppz.util;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

import javafx.scene.image.Image;

public class ImageLoader {

    // Private static instance variable of ImageLoader
    private static ImageLoader imageLoader;

    // Cache to store loaded iamges
    private Map<String, Image> imageCache = new HashMap<>();

    // Private constructor to prevent instantiation
    private ImageLoader() {
    }

    // Public static method to get the single instance of ImageLoader class
    public static ImageLoader getInstanceImageLoader() {
        if (imageLoader == null) {
            imageLoader = new ImageLoader();
        }
        return imageLoader;
    }

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
