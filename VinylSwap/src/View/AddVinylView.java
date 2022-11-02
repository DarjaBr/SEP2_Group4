package View;

import ViewModel.AddVinylViewModel;

public class AddVinylView {

    private AddVinylViewModel viewModel;
    private ViewManager manager;

    public AddVinylView(ViewManager manager, AddVinylViewModel viewModel){
        this.manager = manager;
        this.viewModel = viewModel;
    }
}
