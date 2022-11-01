package Model.Mediator;

import Model.Domain.Vinyl;
import Model.Domain.VinylList;

public class VinylDatabase implements VinylPersistence
{
    public VinylDatabase(){}
    @Override
    public VinylList load() {
        return null;
    }

    @Override
    public void save(VinylList vinylList) {

    }

    @Override
    public void save(Vinyl vinyl) {

    }

    @Override
    public void remove(Vinyl vinyl) {

    }

    @Override
    public void clear() {

    }
}
