package Model.Mediator;

import Model.Domain.Vinyl;
import Model.Domain.VinylList;

public interface VinylPersistence {

    VinylList load();
    void save(VinylList vinylList);
    void save(Vinyl vinyl);
    void remove(Vinyl vinyl);
    void clear();
}
