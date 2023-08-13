package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Line line = new Line(0,0,100,100);
        line.setStroke(Color.GREEN);
        Ellipse ellipse = new Ellipse(0,0,100,100);
        ellipse.setFill(Color.BLUE);
        Text text = new Text(100,100,"===");
        text.setFont(Font.font(50));
        Group group = new Group();
        Scene scene = new Scene(group,300,400);
        group.getChildren().add(line);
        group.getChildren().add(ellipse);
        group.getChildren().add(text);
        stage.setTitle("-^_^-");
        stage.setScene(scene);
        stage.show();

    }
}