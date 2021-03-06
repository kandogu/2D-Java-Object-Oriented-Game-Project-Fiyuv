package org.openjfx.view.gameSceneView.commonViews.spacecraftView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Flame extends ImageView {
    private static Image image;

    static {
        try {
            image = new Image(new FileInputStream("assets/preBossAssets/Flame_01.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Flame() {
        super(image);
    }

}
