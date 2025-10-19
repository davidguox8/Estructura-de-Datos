package com.davidsystems.reporteprac;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class that loads the QueueExercise view.
 * Clase principal que carga la vista QueueExercise.
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("queueexercise-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Queue Example - Ejemplo de Fila");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

