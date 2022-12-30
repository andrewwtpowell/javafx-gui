package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.io.IOException;

public class GUI_Application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button btn1 = new Button("Test 1");
        HBox hBtn1 = new HBox(10);
        hBtn1.setAlignment(Pos.CENTER);
        hBtn1.getChildren().add(btn1);
        grid.add(hBtn1, 1, 1);

        Button btn2 = new Button("Test 2");
        HBox hBtn2 = new HBox(10);
        hBtn2.setAlignment(Pos.CENTER);
        hBtn2.getChildren().add(btn2);
        grid.add(hBtn2, 1, 2);

        final Text btn1_actiontarget = new Text();
        final Text btn2_actiontarget = new Text();
        grid.add(btn1_actiontarget, 1, 3);
        grid.add(btn2_actiontarget, 1, 3);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btn1_actiontarget.setFill(Color.BLACK);
                btn1_actiontarget.setText("Test 1 Running");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btn2_actiontarget.setFill(Color.BLACK);
                btn2_actiontarget.setText("Test 2 Running");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setTitle("GUI");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
