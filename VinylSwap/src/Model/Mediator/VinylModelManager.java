package Model.Mediator;

import Model.Domain.Vinyl;
import Model.Domain.VinylList;

public class VinylModelManager implements VinylModel{

    public VinylModelManager(){}

    @Override
    public VinylList getAll() {
        return null;
    }

    @Override
    public Vinyl removeVinyl(String name) {
        return null;
    }

    @Override
    public Vinyl getVinyl(int index) {
        return null;
    }

    @Override
    public VinylList getVinyls(String name) {
        return null;
    }

    @Override
    public int getNumberOfVinyls() {
        return 0;
    }
}
