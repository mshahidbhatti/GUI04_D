package com.example.demo4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Application3 extends Application {

    private Stage stage;
    private Scene mainMenu;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;

        Button addCampusBtn = new Button("Add Campus");
        Button addDeptBtn = new Button("Add Department");
        Button addLabsBtn = new Button("Add Labs");
        Button addSystemsBtn = new Button("Add Systems");
        Button exitBtn = new Button("Exit");

        addCampusBtn.setOnAction(e ->
                setScene(createScene("Add Campus"))
        );
        addDeptBtn.setOnAction(e -> setScene(createScene("Add Department")));
        addLabsBtn.setOnAction(e -> setScene(createScene("Add Labs")));
        addSystemsBtn.setOnAction(e -> setScene(createScene("Add Systems")));
        exitBtn.setOnAction(e -> System.exit(0));

        VBox vbox = new VBox(addCampusBtn, addDeptBtn, addLabsBtn, addSystemsBtn, exitBtn);
        mainMenu = new Scene(vbox, 200, 200);
        primaryStage.setScene(mainMenu);
        primaryStage.show();
    }

    private Scene createScene(String title) {
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> setScene(mainMenu));
        VBox vbox = new VBox(new Label(title), backButton);
        return new Scene(vbox, 200, 200);
    }

    private void setScene(Scene scene) {
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
