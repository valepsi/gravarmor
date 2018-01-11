package fr.epsi.gravarmor.model;

public enum BoxType {
    OUT(false),
    SAND(true),
    QUICKSAND(true),
    FOREST(true),
    MONTAINS(false),
    HIDDEN(false),
    WATER(false);

    private boolean isAvailableForInterraction;

    BoxType(boolean isAvailableForInterraction) {

        this.isAvailableForInterraction = isAvailableForInterraction;
    }

    public boolean isAvailableForInterraction() {

        return isAvailableForInterraction;
    }

    public static BoxType fromChar(char car) {

        switch(car) {
            case 'S':
                return BoxType.SAND;

            case 'Q':
                return BoxType.QUICKSAND;

            case 'F':
                return BoxType.FOREST;

            case 'M':
                return BoxType.MONTAINS;

            case 'W':
                return BoxType.WATER;

            case 'H':
                return BoxType.HIDDEN;

            default:
                return BoxType.OUT;
        }
    }
}
