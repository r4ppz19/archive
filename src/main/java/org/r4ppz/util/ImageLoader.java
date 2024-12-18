package org.r4ppz.util;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

import javafx.scene.image.Image;

public class ImageLoader {

    private static ImageLoader imageLoader;


    private ImageLoader() {
    }

    public static ImageLoader getInstanceImageLoader() {
        if (imageLoader == null) {
            imageLoader = new ImageLoader();
        }
        return imageLoader;
    }

    // Using cache mechanism for loading an image
    private final Map<String, Image> imageCache = new HashMap<>();
    public Image loadImage(String imagePath) {
        if (imageCache.containsKey(imagePath)) {
            return imageCache.get(imagePath);
        }

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
        imageCache.put(imagePath, image);

        return image;
    }
}
