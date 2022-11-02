package ViewModel;

import Model.Domain.Vinyl;

public class AddVinylViewModel {

    private Vinyl vinyl;
    private ViewModelManager vmManager;

    public AddVinylViewModel(ViewModelManager vmManager, Vinyl vinyl){
        this.vinyl = vinyl;
        this.vmManager = vmManager;
    }
}
