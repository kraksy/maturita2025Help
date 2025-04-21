package com.example.podnik;

import com.example.podnik.core.PSEmployeeManager;
import com.example.podnik.core.PSPosition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setTitle("Hello!");


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        PSPosition janitor = new PSPosition(PSPosition.currentID+1, "janitor");
        PSPosition accountant = new PSPosition(PSPosition.currentID+1, "accountant");
        PSPosition manager =  new PSPosition(PSPosition.currentID+1, "manager");

        PSEmployeeManager employeeManager = new PSEmployeeManager();



        launch();
    }
}