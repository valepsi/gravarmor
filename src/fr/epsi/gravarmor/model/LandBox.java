package fr.epsi.gravarmor.model;

public class LandBox {

    private BoxType type;
    private ILandEntity entity;

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
}
