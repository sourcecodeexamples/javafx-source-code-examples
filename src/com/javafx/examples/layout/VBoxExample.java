package com.javafx.examples.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

    	VBox root = new VBox(5);
        root.setPadding(new Insets(10));
        
        Button prevBtn = new Button("Previous");
        Button nextBtn = new Button("Next");
        Button cancBtn = new Button("Cancel");
        Button helpBtn = new Button("Help");
        Button exitBtn = new Button("Exit");
        Button stopBtn = new Button("Stop");
        
        root.getChildren().addAll(prevBtn, nextBtn, cancBtn, helpBtn, exitBtn, stopBtn);

        Scene scene = new Scene(root,200,200);
        stage.setTitle("showing buttons in vertical column");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
