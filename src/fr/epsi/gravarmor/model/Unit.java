package fr.epsi.gravarmor.model;


public class Unit extends Entity {
    private boolean actif;
    private boolean destroyed;
    private int mouvementPoint;
    private UnitType type;


    public Unit(UnitType type) {
        super();
        actif = true;
        destroyed = false;
        this.type = type;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public int getMouvementPoint() {
        return mouvementPoint;
    }

    public void setMouvementPoint(int mouvementPoint) {
        this.mouvementPoint = mouvementPoint;
    }

    public UnitType getType() {
        return type;
    }

    public void setType(UnitType type) {
        this.type = type;
    }

    public String toString(){
        return type.toString();
    }

    public void mouv(LandBox boxD,LandBox boxA){
        int pmRestant = this.type.getMouvementPoint() - this.getMouvementPoint();
        if (pmRestant >= boxA.getType().getPm()) {
            boxD.getEntities().remove(this);
            boxA.getEntities().add(this);
        }

    }
}
