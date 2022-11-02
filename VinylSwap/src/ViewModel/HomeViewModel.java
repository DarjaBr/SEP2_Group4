package ViewModel;

import Model.Domain.Vinyl;

public class HomeViewModel {
    private Vinyl vinyl;

    private ViewModelManager vmManager;

    public HomeViewModel(ViewModelManager vmManager, Vinyl vinyl){
        this.vinyl = vinyl;
        this.vmManager = vmManager;
    }

}
