package com.davidsystems.reporteprac.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Controller for the Queue Exercise.
 * Controlador del ejercicio de Fila (Cola).
 */
public class QueueExerciseController {

    @FXML
    private TextField txtElement; // Text field for input / Campo de texto para ingresar elementos

    @FXML
    private ListView<String> listViewQueue; // Visual representation of the queue / Muestra visual de la cola

    private final Queue<String> queue = new LinkedList<>(); // Queue structure / Estructura de la cola

    /**
     * Adds an element to the queue.
     * Agrega un elemento a la fila (cola).
     */
    @FXML
    protected void onEnqueue() {
        String element = txtElement.getText().trim();
        if (element.isEmpty()) {
            showAlert("Error", "Please enter an element / Por favor ingresa un elemento.");
            return;
        }

        queue.offer(element); // Adds element to the queue / Agrega el elemento a la cola
        txtElement.clear(); // Clears the input / Limpia el campo de texto
        updateListView(); // Updates the visual list / Actualiza la vista de la lista
    }

    /**
     * Removes the first element from the queue.
     * Elimina el primer elemento de la fila (cola).
     */
    @FXML
    protected void onDequeue() {
        if (queue.isEmpty()) {
            showAlert("Warning", "Queue is empty / La fila está vacía.");
            return;
        }

        String removed = queue.poll(); // Removes first element / Elimina el primer elemento
        showAlert("Removed", "Removed element: " + removed + " / Elemento eliminado: " + removed);
        updateListView();
    }

    /**
     * Updates the ListView to display current queue.
     * Actualiza el ListView para mostrar la cola actual.
     */
    private void updateListView() {
        listViewQueue.getItems().setAll(queue);
    }

    /**
     * Shows a message dialog.
     * Muestra un cuadro de diálogo con mensaje.
     */
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
