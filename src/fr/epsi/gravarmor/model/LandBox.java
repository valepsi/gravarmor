package fr.epsi.gravarmor.model;

import javafx.scene.shape.Shape;

public class LandBox {

    private BoxType type;
    private ILandEntity entity;
    private Shape shape;

    public LandBox(BoxType type) {

        this.type = type;
        this.entity = null;
    }

    public LandBox(BoxType type, ILandEntity entity) {

        this.type = type;
        this.entity = entity;
    }

    public BoxType getType() {

        return type;
    }

    public ILandEntity getEntity() {

        return entity;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
