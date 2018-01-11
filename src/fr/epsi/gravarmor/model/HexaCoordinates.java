package fr.epsi.gravarmor.model;

public class HexaCoordinates {

    private int x;
    private int y;

    public HexaCoordinates(int x, int y) {

        set(x, y);
    }

    protected void set(int x, int y) {

        setX(x);
        setY(y);
    }

    protected void setX(int x) {

        this.x = x;
    }

    protected void setY(int y) {

        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public HexaCoordinates getTopCoordinates() {

        return new HexaCoordinates(x, y-1);
    }

    public HexaCoordinates getBottomCoordinates() {

        return new HexaCoordinates(x, y+1);
    }

    public HexaCoordinates getTopLeftCoordinates() {

        return new HexaCoordinates(x-1, (x%2 == 1? y : y-1));
    }

    public HexaCoordinates getBottomLeftCoordinates() {

        return new HexaCoordinates(x-1, (x%2 == 1? y+1 : y));
    }

    public HexaCoordinates getTopRightCoordinates() {

        return new HexaCoordinates(x+1, (x%2 == 1? y : y-1));
    }

    public HexaCoordinates getBottomRightCoordinates() {

        return new HexaCoordinates(x+1, (x%2 == 1? y : y-1));
    }

    public boolean equals(HexaCoordinates coordinates) {

        return x == coordinates.getX() && y == coordinates.getY();
    }

    public String toString() {

        return "HexCoordinates(" + x +", " + y + ")";
    }
}
