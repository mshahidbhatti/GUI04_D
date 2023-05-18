package com.example.demo4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Campus campus=new Campus("","");
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid=new GridPane();
        Label title=new Label("COMSATS University Lahore, Campus");
        grid.add(title,0,0,2,1);

        Button saveButton=new Button("Save");
        Label address=new Label("Address");
        TextField addressTextField=new TextField();
        TextField campusNameTextField=new TextField();
        EventHandler<ActionEvent> handler=new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                campus.setName(campusNameTextField.getText());
                campus.setAddress(addressTextField.getText());
                campusNameTextField.setText("");
                addressTextField.setText("");
                System.out.println("Button clicked");
            }

        };

        //event handling
        saveButton.setOnAction(handler);

        grid.add(address,0,2);
        grid.add(addressTextField,1,2);
        HBox hbox=new HBox();
        hbox.getChildren().add(saveButton);
        hbox.setAlignment(Pos.TOP_RIGHT);
        grid.add(hbox,1,3);
        grid.setPadding(new Insets(20,20,20,20));
        grid.setHgap(10);
        grid.setVgap(10);
        Label campusNameLabel=new Label("Campus Name");

        grid.add(campusNameLabel,0,1);
        grid.add(campusNameTextField,1,1);
        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}