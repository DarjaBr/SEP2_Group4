package View;

import ViewModel.HomeViewModel;

public class HomeView {

    private HomeViewModel viewModel;

    private ViewManager manager;

    public HomeView(ViewManager manager, HomeViewModel viewModel){
        this.manager = manager;
        this.viewModel = viewModel;
    }

}
