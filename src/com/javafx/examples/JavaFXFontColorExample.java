package com.javafx.examples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXFontColorExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text();

		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
		text.setFill(Color.BLUE);// setting color of the text to blue
		text.setStroke(Color.BLACK); // setting the stroke for the text
		text.setStrokeWidth(1); // setting stroke width to 2
		text.setText("Welcome to Java Guides");
		Group root = new Group();
		Scene scene = new Scene(root, 500, 200);
		root.getChildren().add(text);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Font Color Example");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
