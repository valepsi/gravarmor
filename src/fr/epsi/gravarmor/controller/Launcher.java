package fr.epsi.gravarmor.controller;

import fr.epsi.gravarmor.model.HexaCoordinates;
import fr.epsi.gravarmor.model.HexaLand;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    private HexaLand land;
    private WindowController windowController;

    static final double HEXA_WIDTH = 30;
    static final double HEXA_HEIGHT = Math.sqrt(3)/2*HEXA_WIDTH;

    public void start(Stage stage) {

        land = new HexaLand();

        try {
            FXMLLoader windowLoader = new FXMLLoader(getClass().getClassLoader().getResource("fr/epsi/gravarmor/view/fxml/windowView.fxml"));
            VBox windowView = windowLoader.load();
            windowController = windowLoader.getController();

            Scene scene = new Scene(windowView, (land.getWidth()*HEXA_WIDTH*3/4)+HEXA_WIDTH/4+5, land.getHeight()*HEXA_HEIGHT+28);

            if(Screen.getScreens().size() > 1) {
                Screen screen = Screen.getScreens().get(1);
                Rectangle2D bounds = screen.getVisualBounds();

                stage.setX(bounds.getMinX() + 100);
                stage.setY(bounds.getMinY() + 100);
            }

            stage.setScene(scene);
            stage.setTitle("Gravarmor");
            stage.getIcons().add(new Image("fr/epsi/gravarmor/icons/appIcon.png"));
            stage.show();

            ScrollPane landPane = (ScrollPane)windowView.lookup("#landPane");
            LandController landController = new LandController(landPane, land);
            landController.drawLand();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop(){

        System.out.println("Stopping!");
        if(windowController != null) {
            windowController.stop();
        }
    }

    public static void main (String args[]){
        launch(args);
    }
}
