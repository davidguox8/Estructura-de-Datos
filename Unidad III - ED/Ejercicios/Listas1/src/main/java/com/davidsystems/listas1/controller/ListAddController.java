package com.davidsystems.listas1.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

public class ListAddController {

    @FXML
    private TextField nameField;
    @FXML
    private ListView<String> nameList;

    // List to store names / Lista para almacenar los nombres
    private List<String> names = new ArrayList<>();

    @FXML
    private void addToList() {
        String name = nameField.getText();

        if (!name.isEmpty()) {
            names.add(name); // Add name to list / Agregar nombre a la lista
            updateList();
            nameField.clear();
        }
    }

    private void updateList() {
        nameList.getItems().setAll(names);
    }
}
