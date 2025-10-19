package com.davidsystems.cola2.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveController {

    @FXML
    private ListView<String> queueList;

    // Initialize a queue with sample data / Cola con datos iniciales
    private Queue<String> queue = new LinkedList<>();

    @FXML
    public void initialize() {
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        updateList();
    }

    @FXML
    private void removeFromQueue() {
        if (!queue.isEmpty()) {
            queue.poll(); // Remove the first element / Eliminar el primero
            updateList(); // Update the view / Actualizar la vista
        }
    }

    private void updateList() {
        queueList.getItems().setAll(queue);
    }
}
