package com.example.model;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Home {
	@FXML
	Button addBtn;
	public void addBtn() throws Exception{
		Parent root = FXMLLoader.load (getClass ().getResource ("addVinyl.fxml"));
		Stage Window = (Stage) addBtn.getScene ().getWindow ();
		Window.setScene (new Scene (root,750,500));
	}

}
