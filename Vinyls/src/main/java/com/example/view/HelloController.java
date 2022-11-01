package com.example.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

	@FXML
	Button startBtn;
	public void startBtn() throws Exception{
		Parent root = FXMLLoader.load (getClass ().getResource ("Home.fxml"));
		Stage Window = (Stage) startBtn.getScene ().getWindow ();
		Window.setScene (new Scene (root,750,500));
	}

}