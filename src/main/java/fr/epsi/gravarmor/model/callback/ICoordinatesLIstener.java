package fr.epsi.gravarmor.model.callback;

import fr.epsi.gravarmor.model.coordinates.HexaCoordinates;

public interface ICoordinatesLIstener {

    public void handleEvent(HexaCoordinates coordinates);
}
