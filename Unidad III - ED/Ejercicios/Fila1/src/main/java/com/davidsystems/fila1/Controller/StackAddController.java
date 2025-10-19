package com.davidsystems.fila1.Controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Stack;

public class StackAddController {

    @FXML
    private TextField itemField;
    @FXML
    private ListView<String> stackList;

    // Stack to store elements / Pila para almacenar elementos
    private Stack<String> stack = new Stack<>();

    @FXML
    private void pushToStack() {
        // Get the text / Obtener el texto
        String item = itemField.getText();

        if (!item.isEmpty()) {
            stack.push(item); // Add to top / Agregar arriba de la pila
            updateList();     // Refresh list / Actualizar lista
            itemField.clear();// Clear input / Limpiar campo
        }
    }

    private void updateList() {
        // Show stack (top at top) / Mostrar pila (tope arriba)
        stackList.getItems().setAll(stack);
    }
}
