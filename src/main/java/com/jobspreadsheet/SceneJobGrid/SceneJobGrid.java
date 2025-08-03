package com.jobspreadsheet.SceneJobGrid;

// import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
// import javafx.scene.input.*;
import javafx.scene.layout.*;
// import javafx.stage.Stage;
import javafx.geometry.Insets;

public class SceneJobGrid {

    private static HBox createBoard() {
        // TODO: The following is ChatGPT driven, replace with customizations

        int numberOfBoxes, boardSpacing, boardSideSpacing, columnSpacing, columnSideSpacing, columnWidth;

        numberOfBoxes = 3;

        boardSpacing = 30;
        boardSideSpacing = 10;
        columnSpacing = 40;
        columnSideSpacing = 10;

        columnWidth = 200;

        HBox board = new HBox(boardSpacing);
        board.setPadding(new Insets(boardSideSpacing));
        board.setStyle("-fx-background-color: lightgray;");

        for (int i = 0; i < numberOfBoxes; i++) {
            VBox column = new VBox(columnSpacing);
            column.setPadding(new Insets(columnSideSpacing));
            column.setStyle("-fx-background-color: white; -fx-border-color: black;");
            column.setPrefWidth(columnWidth);

            Label header = new Label("Column " + (i + 1));
            column.getChildren().add(header);

            board.getChildren().add(column);
        }

        return board;
    }

    public static Scene createScene() {
        double width, height;
        width = height = 450;
        return new Scene(createBoard(), width, height);
    }
}
