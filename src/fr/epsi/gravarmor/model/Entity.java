package fr.epsi.gravarmor.model;


public class Entity {

    public Entity() {

    }

    public void mouvObject(LandBox boxD,LandBox boxA){
            boxD.getEntities().remove(this);
            boxA.getEntities().add(this);
        }

}
