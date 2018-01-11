package fr.epsi.gravarmor.controller;

import fr.epsi.gravarmor.model.BoxType;
import fr.epsi.gravarmor.model.HexaCoordinates;
import fr.epsi.gravarmor.model.HexaLand;
import fr.epsi.gravarmor.model.LandBox;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

import static fr.epsi.gravarmor.controller.Launcher.HEXA_HEIGHT;
import static fr.epsi.gravarmor.controller.Launcher.HEXA_WIDTH;

class LandController {

    private final ScrollPane pane;
    private final HexaLand land;

    LandController(ScrollPane pane, HexaLand land) {

        this.pane = pane;
        this.land = land;
    }

    public void drawLand() {

        Group g = new Group();

        for(int yl = 0; yl < land.getHeight(); yl++) {

            for (int xl = 0; xl < land.getWidth(); xl++) {

                final HexaCoordinates coordinates = new HexaCoordinates(xl, yl);
                final LandBox box = land.getBox(coordinates);

                if (box.getType() == BoxType.HIDDEN) {
                    continue;
                }

                double x = -HEXA_WIDTH / 3 + xl * HEXA_WIDTH - xl * (HEXA_WIDTH / 4);
                double y = -HEXA_HEIGHT / 2 + yl * HEXA_HEIGHT + (xl % 2 == 1 ? HEXA_HEIGHT / 2 : 0);

                final Polygon polygon = new Polygon();
                polygon.getPoints().addAll(x + HEXA_WIDTH / 4, y + 0,
                        x + HEXA_WIDTH / 4 * 3, y + 0,
                        x + HEXA_WIDTH, y + HEXA_HEIGHT / 2,
                        x + HEXA_WIDTH / 4 * 3, y + HEXA_HEIGHT,
                        x + HEXA_WIDTH / 4, y + HEXA_HEIGHT,
                        x + 0, y + HEXA_HEIGHT / 2);
                g.getChildren().add(polygon);

                polygon.setStroke(Color.WHITE);
                polygon.setFill(Color.WHITE);

                new Timeline(new KeyFrame(
                        Duration.millis(1000 + xl * Math.random() * 200),
                        ae -> polygon.setFill(getColorForType(box.getType())))
                ).play();

            }
        }

        pane.setContent(g);
    }

    private Color getColorForType(BoxType type) {

        switch(type) {
            case SAND:
                return Color.rgb(209, 178, 40);

            case QUICKSAND:
                return Color.rgb(200, 119, 20);

            case FOREST:
                return Color.rgb(107, 129, 28);

            case MONTAINS:
                return Color.rgb(59, 30, 22);

            case WATER:
                return Color.rgb(105, 142, 142);

            default:
                return getColorForType(BoxType.WATER);
        }
    }
}
