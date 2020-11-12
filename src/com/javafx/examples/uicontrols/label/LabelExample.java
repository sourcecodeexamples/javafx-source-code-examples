package com.javafx.examples.uicontrols.label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// An empty label
		Label label1 = new Label();
		// A label with the text element
		Label label2 = new Label("Search");
		// A label with the text element and graphical icon
		//Image image = new Image(getClass().getResourceAsStream("labels.jpg"));
		//Label label3 = new Label("Search", new ImageView(image));

		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.getChildren().add(label1);
		root.getChildren().add(label2);
		//root.getChildren().add(label2);

		Scene scene = new Scene(root);

		stage.setTitle("No sleep");
		stage.setScene(scene);
		stage.show();
	}

}
