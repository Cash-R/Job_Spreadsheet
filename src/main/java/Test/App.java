// package main.java.Test;

// Use following if running on powershell
package Test;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me");
        button.getStyleClass().add("test-button");

        VBox root = new VBox(button);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX CSS Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}