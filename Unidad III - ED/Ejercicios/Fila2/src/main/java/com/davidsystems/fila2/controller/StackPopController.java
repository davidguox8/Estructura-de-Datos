package com.davidsystems.fila2.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Stack;

public class StackPopController {

    @FXML
    private ListView<String> stackList;

    private Stack<String> stack = new Stack<>();

    @FXML
    public void initialize() {
        // Initial data / Datos iniciales
        stack.push("A");
        stack.push("B");
        stack.push("C");
        updateList();
    }

    @FXML
    private void popFromStack() {
        if (!stack.isEmpty()) {
            stack.pop(); // Remove top element / Eliminar el tope
            updateList();
        }
    }

    private void updateList() {
        stackList.getItems().setAll(stack);
    }
}
