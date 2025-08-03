package com.jobspreadsheet.ThisVexesMe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
// import javafx.scene.input.KeyCombination;


public class ThisVexesMe extends Application{

    @Override
    public void start(Stage primaryStage) {
        double width, height;
        width = 550;
        height = 500;

        Image meme = new Image("/meme.png", width, height, true, false);
        ImageView imageView = new ImageView(meme);
        HBox root = new HBox(imageView);

        Scene scene = new Scene(root, width, height);
        primaryStage.getIcons().add(meme);
        primaryStage.setScene(scene);

        // primaryStage.setFullScreen(true);
        // primaryStage.setFullScreenExitHint("Press q");
        // primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
