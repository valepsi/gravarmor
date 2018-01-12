package fr.epsi.gravarmor.model.coordinates;

public class HexaCoordinates {

    private Point point;

    public HexaCoordinates(Point point) {

        this.point = point;
    }

    public HexaCoordinates(Cube cube) {

        this.point = Point.from(cube);
    }

    public Point getPoint() {

        return point;
    }

    public Cube getCube() {

        return Cube.from(point);
    }

    public static int distance(HexaCoordinates from, HexaCoordinates to) {

        Cube fromCube = from.getCube();
        Cube toCube = to.getCube();

        return Math.max(Math.max(Math.abs(fromCube.getX() - toCube.getX()), Math.abs(fromCube.getY() - toCube.getY())), Math.abs(fromCube.getZ() - toCube.getZ()));
    }

    private static int lerp(int a, int b, double t) {

        return (int)(a + (b - a)*t);
    }

    private static Cube lerp(Cube a, Cube b, double t) {

        return new Cube(
                lerp(a.getX(), b.getX(), t),
                lerp(a.getY(), b.getY(), t),
                lerp(a.getZ(), b.getZ(), t)
        );
    }

    private static Cube round(Cube cube) {

        int rx = Math.round(cube.getX());
        int ry = Math.round(cube.getY());
        int rz = Math.round(cube.getZ());

        int x_diff = Math.abs(rx - cube.getX());
        int y_diff = Math.abs(ry - cube.getY());
        int z_diff = Math.abs(rz - cube.getZ());

        if(x_diff > y_diff && x_diff > z_diff) {

            rx = -ry-rz;
        }
        else if(y_diff > z_diff) {

            ry = -rx-rz;
        }
        else {

            rz = -rx-ry;
        }

        return new Cube(rx, ry, rz);
    }

    public static HexaCoordinates[] line(HexaCoordinates from, HexaCoordinates to) {

        int distance = distance(from, to);

        HexaCoordinates result[] = new HexaCoordinates[distance+1];

        for(int i = 0; i <= distance; i++) {

            Cube lerpResult = lerp(from.getCube(), to.getCube(), 1.0/distance * i);

            result[i] = new HexaCoordinates(round(lerpResult));
        }

        return result;
    }

    public String toString() {

        return "HexCoordinates(" + point + ", " + Cube.from(point) + ")";
    }
}
