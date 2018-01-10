package fr.epsi.gravarmor.model;

public enum BoxType {
    GRASS(true, true),
    STONE(false, false),
    WATER(false, true);

    private boolean isAvailableForArmy;
    private boolean isAvailableForBullet;

    BoxType(boolean isAvailableForArmy, boolean isAvailableForBullet) {

        this.isAvailableForArmy = isAvailableForArmy;
        this.isAvailableForBullet = isAvailableForBullet;
    }

    public boolean isAvailableForArmy() {

        return isAvailableForArmy;
    }

    public boolean isAvailableForBullet() {

        return isAvailableForBullet;
    }
}
