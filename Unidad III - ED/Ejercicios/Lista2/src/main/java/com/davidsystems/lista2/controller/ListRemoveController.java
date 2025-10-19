package com.davidsystems.lista2.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

public class ListRemoveController {

    @FXML
    private ListView<String> itemList;

    private List<String> items = new ArrayList<>();

    @FXML
    public void initialize() {
        // Add some sample data / Agregar datos de ejemplo
        items.add("Dog");
        items.add("Cat");
        items.add("Bird");
        updateList();
    }

    @FXML
    private void removeSelected() {
        String selected = itemList.getSelectionModel().getSelectedItem();

        if (selected != null) {
            items.remove(selected); // Remove the selected item / Eliminar el elemento seleccionado
            updateList();            // Refresh the view / Actualizar la vista
        }
    }

    private void updateList() {
        itemList.getItems().setAll(items);
    }
}
