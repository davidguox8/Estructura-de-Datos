package com.davidsystems.fila3.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Stack;

public class StackPeekController {

    @FXML
    private Label peekLabel;

    private Stack<String> stack = new Stack<>();

    @FXML
    public void initialize() {
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
    }

    @FXML
    private void peekStack() {
        // View top element without removing / Ver tope sin eliminar
        if (!stack.isEmpty()) {
            String top = stack.peek();
            peekLabel.setText("Top element: " + top);
        } else {
            peekLabel.setText("Stack is empty / La pila está vacía");
        }
    }
}
