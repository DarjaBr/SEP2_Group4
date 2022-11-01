module com.example.vinyls {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.vinyls to javafx.fxml;
	exports com.example.vinyls;
	exports com.example.viewmodel;
	opens com.example.viewmodel to javafx.fxml;
	exports com.example.view;
	opens com.example.view to javafx.fxml;
	exports com.example.model;
	opens com.example.model to javafx.fxml;
}