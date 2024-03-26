package com.jmc.banking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Click me!");
        Button button1 = new Button("Exit");
//        button.setOnAction(e -> text.setText("Welcome to My first program !!!"));
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> text.setText("Welcome to My first program !!!"));
        button1.setOnAction(e -> Platform.exit());
        root.getChildren().addAll(text, button, button1);
        Scene scene = new Scene(root, 350, 400);
        stage.setTitle("JavaFX Application!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing the Application");
    }

    public static void main(String[] args) {
        launch();
    }
}