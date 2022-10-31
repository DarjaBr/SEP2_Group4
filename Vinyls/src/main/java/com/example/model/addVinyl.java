package com.example.model;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class addVinyl {
	@FXML
	Button backBtn;
	public void backBtn() throws Exception{
		Parent root = FXMLLoader.load (getClass ().getResource ("Home.fxml"));
		Stage Window = (Stage) backBtn.getScene ().getWindow ();
		Window.setScene (new Scene (root,750,500));
	}
}
