package View;

import ViewModel.ViewModelManager;


import java.io.IOException;

public class ViewManager {

    private ViewModelManager vmManager;
    private Stage stage;

    private static final String HOME_PATH = "/home.fxml";
    private static final String ADD_VINYL_PATH = "/addVinyl.fxml";

    public ViewManager(ViewModelManager manager, Stage stage) {
        this.vmManager = manager;
        this.stage = stage;
    }

    public void openChatView() {
        openView(HOME_PATH, getHomeController());
    }

    public void openLoginView() {
        openView(ADD_VINYL_PATH, getAddVinylController());
    }

    private void openView(String path, Object controller) {
        Scene scene = new Scene(loadFxml(path, controller));
        stage.setScene(scene);
        stage.show();
    }

    private Parent loadFxml(String path, Object controller) {
        var loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        loader.setController(controller);

        try {

            return loader.load();

        } catch(IOException e) {

            e.printStackTrace();

            return null;
        }
    }


    public HomeView getHomeController() {
        return new HomeView(this, vmManager.getHomeViewModel());
    }

    public AddVinylView getAddVinylController() {
        return new AddVinylView(this, vmManager.getAddVinyl());
    }
}
