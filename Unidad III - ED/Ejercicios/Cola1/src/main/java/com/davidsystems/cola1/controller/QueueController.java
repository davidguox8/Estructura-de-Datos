package com.davidsystems.cola1.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueController {

    @FXML
    private TextField nameField;
    @FXML
    private ListView<String> queueList;

    // Queue to store names
    // Cola para almacenar los nombres
    private Queue<String> queue = new LinkedList<>();

    @FXML
    private void addToQueue() {
        // Get name from text field / Obtener el nombre del campo de texto
        String name = nameField.getText();

        if (!name.isEmpty()) {
            queue.add(name); // Add to queue / Agregar a la cola
            updateList(); // Refresh the list / Actualizar la lista
            nameField.clear(); // Clear text field / Limpiar el campo
        }
    }

    private void updateList() {
        queueList.getItems().setAll(queue); // Mostrar todos los elementos de la cola
    }
}
