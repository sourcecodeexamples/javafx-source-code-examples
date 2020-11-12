package com.javafx.examples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXTextFontExample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text();

		// position of text
		text.setX(100);
		text.setY(100);
		
		// font for text
		text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
		text.setText("Welcome to Java Guides");
		Group root = new Group();
		Scene scene = new Scene(root, 500, 400);
		root.getChildren().add(text);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Text Font Example");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}