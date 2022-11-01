package Model.Mediator;

import Model.Domain.Vinyl;
import Model.Domain.VinylList;

public interface VinylModel {

    VinylList getAll();
    Vinyl removeVinyl(String name);
    Vinyl getVinyl(int index);
    VinylList getVinyls(String name);
    int getNumberOfVinyls();
}
