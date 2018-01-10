package fr.epsi.gravarmor.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    private WindowController windowController = null;

    public void start(Stage stage) {

        try {
            FXMLLoader windowLoader = new FXMLLoader(getClass().getClassLoader().getResource("fr/epsi/gravarmor/view/fxml/windowView.fxml"));
            VBox windowView = windowLoader.load();
            windowController = windowLoader.getController();
            windowController.setStage(stage);

            Scene scene = new Scene(windowView, 1000, 800);

            stage.setScene(scene);
            stage.setTitle("Grave Armor");
            stage.getIcons().add(new Image("fr/epsi/gravarmor/icons/appIcon.png"));
            stage.show();
        }
        catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    public void stop(){

        System.out.println("Stopping!");
        windowController.stop();
    }

    public static void main (String args[]){
        launch(args);
    }
}
