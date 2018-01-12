package fr.epsi.gravarmor.model.coordinates;

public class Cube {

    private int x;
    private int y;
    private int z;

    public Cube(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public int getZ() {

        return z;
    }

    static public Cube from(Point point) {

        int x = point.getX();
        int z = point.getY() - (point.getX() - (point.getX()&1))/2;
        int y = -x-z;

        return new Cube(x, y, z);
    }

    @Override
    public String toString() {

        return "Cube(x: " + x + ", y: " + y + ", z: " + z + ")";
    }
}
