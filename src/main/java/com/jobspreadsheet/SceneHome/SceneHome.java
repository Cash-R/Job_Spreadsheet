package com.jobspreadsheet.SceneHome;

import static com.mongodb.client.model.Filters.eq;
import java.security.Key;

// JavaFX Dependencies
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.input.KeyCombination;

// MongoDB Dependencies
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


/**
 * Home Screen Scene. Buttons/Branching paths to the rest of scenes
 */
public class SceneHome extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me");
        button.getStyleClass().add("test-button");

        VBox root = new VBox(button);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        
        Image meme = new Image("/meme.png");
        primaryStage.getIcons().add(meme);

        primaryStage.setHeight(450);
        primaryStage.setWidth(450);
        primaryStage.setResizable(false);

        // TODO: The following may be helpful if attempting to create the passcode idea\
        
        // primaryStage.setFullScreen(true);
        // primaryStage.setFullScreenExitHint("Press q");
        // primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX CSS Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}