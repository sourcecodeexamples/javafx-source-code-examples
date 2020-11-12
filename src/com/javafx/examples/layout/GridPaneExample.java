package com.javafx.examples.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label firsName = new Label("First Name");
		Label lastName = new Label("Last Name");
		Label userName = new Label("User Name");
		Label emailId = new Label("Email Id");

		TextField textField1 = new TextField();
		TextField textField2 = new TextField();
		TextField textField3 = new TextField();
		TextField textField4 = new TextField();

		Button Submit = new Button("Submit");

		GridPane root = new GridPane();
		root.setHgap(8);
		root.setVgap(8);
		root.setPadding(new Insets(5));
		Scene scene = new Scene(root, 400, 200);

		root.addRow(0, firsName, textField1);
		root.addRow(1, lastName, textField2);
		root.addRow(2, userName, textField3);
		root.addRow(3, emailId, textField4);
		root.addRow(4, Submit);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
