package com.javafx.examples;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXTextExample extends Application {

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {
		
		// create Text class object
		Text text = new Text();
		
		// add text using setText() method
		text.setText("JavaFX Text Example Tutorial");
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 400, 300);
		root.getChildren().add(text);
		stage.setScene(scene);
		stage.setTitle("JavaFX Text Example");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
