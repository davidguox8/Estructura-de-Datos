package com.davidsystems.colo3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.LinkedList;
import java.util.Queue;

public class PeekController {

    @FXML
    private Label peekLabel;

    private Queue<String> queue = new LinkedList<>();

    @FXML
    public void initialize() {
        queue.add("Red");
        queue.add("Blue");
        queue.add("Green");
    }

    @FXML
    private void peekQueue() {
        // Show first element without removing / Mostrar sin eliminar
        String first = queue.peek();
        if (first != null) {
            peekLabel.setText("First element: " + first);
        } else {
            peekLabel.setText("Queue is empty / La cola está vacía");
        }
    }
}
