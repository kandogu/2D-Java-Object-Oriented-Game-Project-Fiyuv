package org.openjfx;


import javafx.application.Application;
import javafx.stage.Stage;
import org.openjfx.controller.bossSceneControllers.BossGameController;
import org.openjfx.controller.menuController.MainController;
import org.openjfx.controller.menuController.MainMenuController;


/**
 * JavaFX App**
 */
public class App extends Application {

    public static void main (String[]args){
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        MainController mainController = new MainController(stage);
    }
}