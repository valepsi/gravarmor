package fr.epsi.gravarmor.model;

public class Unit extends Entity {


    private int mouvementPoint;
    private int electronicWarfare;
    private int attackValue;
    private int defenseValue;
    private int maximumRange;
    private String name;
    private boolean actif;
    private WeaponType WeaponType;


    public Unit(int mouvementPoint, int electronicWarfare, int attackValue, int defenseValue, int maximumRange, String name, WeaponType WeaponType) {
        super();
        this.mouvementPoint = mouvementPoint;
        this.electronicWarfare = electronicWarfare;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
        this.maximumRange = maximumRange;
        this.name = name;
        this.WeaponType = WeaponType;
        actif = true;
    }

    public int getMouvementPoint() {
        return mouvementPoint;
    }

    public int getElectronicWarfare() {
        return electronicWarfare;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public int getMaximumRange() {
        return maximumRange;
    }

    public String getName() {
        return name;
    }

    public void setMouvementPoint(int mouvementPoint) {
        this.mouvementPoint = mouvementPoint;
    }

    public void setElectronicWarfare(int electronicWarfare) {
        this.electronicWarfare = electronicWarfare;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public void setMaximumRange(int maximumRange) {
        this.maximumRange = maximumRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
