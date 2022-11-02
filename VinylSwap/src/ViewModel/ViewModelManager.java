package ViewModel;

import Model.Domain.Vinyl;

public class ViewModelManager {

    Vinyl vinyl;

    public ViewModelManager(Vinyl vinyl){
        this.vinyl = vinyl;
    }

    public HomeViewModel getHomeViewModel(){return  new HomeViewModel(this, vinyl);}

    public AddVinylViewModel getAddVinyl(){return new AddVinylViewModel(this, vinyl);}
}
