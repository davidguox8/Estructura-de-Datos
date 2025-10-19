package com.davidsystems.lista3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

public class ListSearchController {

    @FXML
    private TextField searchField;
    @FXML
    private Label resultLabel;

    private List<String> names = new ArrayList<>();

    @FXML
    public void initialize() {
        // Initial data / Datos iniciales
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
    }

    @FXML
    private void searchName() {
        String search = searchField.getText();

        // Check if name exists / Verificar si el nombre existe
        if (names.contains(search)) {
            resultLabel.setText(search + " is in the list / está en la lista");
        } else {
            resultLabel.setText(search + " is NOT in the list / NO está en la lista");
        }
    }
}
