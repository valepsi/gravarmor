package fr.epsi.gravarmor.model;

import java.util.ArrayList;
import java.util.List;

public class LandBox {

    private BoxType type;
    private List<ILandEntity> entities;

    public LandBox(BoxType type) {

        this.type = type;
        this.entities = new ArrayList<>();
    }

    public LandBox(BoxType type, ILandEntity entity) {

        this.type = type;
        this.entities = new ArrayList<>();
        this.entities.add(entity);
    }

    public LandBox(BoxType type, List<ILandEntity> entities) {

        this.type = type;
        this.entities = entities;
    }

    public BoxType getType() {

        return type;
    }

    public List<ILandEntity> getEntities() {

        return entities;
    }
}
