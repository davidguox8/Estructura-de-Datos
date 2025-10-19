package com.davidsystems.cambiodeventanass.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Clase controladora para la ventana principal
public class VentanaPrincipalController {

    Stage stage = new Stage();

    // Métodos para cambiar la ventana en JavaFX
    @FXML
    public void onSegundaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/binario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Binary numbers");
        stage.setScene(scene);
        stage.show();
    }

    public void onTerceraVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/decre-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("decrement number");
        stage.setScene(scene);
        stage.show();
    }

    public void onCuarteVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/enbinario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Binary Number Checker5!");
        stage.setScene(scene);
        stage.show();
    }

    public void onQuintaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/fact-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Factorial Number");
        stage.setScene(scene);
        stage.show();
    }

    public void onSextaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/fibonacci-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Fibonacci sequence");
        stage.setScene(scene);
        stage.show();
    }

    public void onSeptimaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/incre-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("increment number");
        stage.setScene(scene);
        stage.show();
    }

    public void onOctavaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/invertir-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Inverted sequence of numbers");
        stage.setScene(scene);
        stage.show();
    }

    public void onNovenaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/orden-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Order of numbers");
        stage.setScene(scene);
        stage.show();
    }
    public void onDecimaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/palin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Palindrome Checker!");
        stage.setScene(scene);
        stage.show();
    }
    public void onOnceabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/potencia-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Potence of Numbers");
        stage.setScene(scene);
        stage.show();
    }
    public void onDoceabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/rectangulo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Area of rectangles");
        stage.setScene(scene);
        stage.show();
    }
    public void onTerceabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/recursion-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Recursion Example - Factorial");
        stage.setScene(scene);
        stage.show();
    }
    public void onCatorceabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/sum-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Recursive Sum");
        stage.setScene(scene);
        stage.show();
    }
    public void onQuintiabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/triangulo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Area of Triangle");
        stage.setScene(scene);
        stage.show();
    }
    public void onDiesiseciabaVentana(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipalController.class.getResource("/com/davidsystems/cambiodeventanass/digi-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("Digit Counter");
        stage.setScene(scene);
        stage.show();
    }

}