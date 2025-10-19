package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IncreController {

    @FXML
    private TextField txtNumber; // Input field where user types a number

    @FXML
    private Label lblResult; // Label to display the final result

    // Method executed when button is clicked
    @FXML
    private void printSequence() {
        try {
            int n = Integer.parseInt(txtNumber.getText()); // Convert input to integer
            if (n < 1) {
                lblResult.setText("Please enter a number greater than 0");
                return;
            }
            StringBuilder sb = new StringBuilder(); // Store result as string
            incre(n, sb); // Call recursive method
            lblResult.setText("Result: " + sb.toString()); // Display result
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number");
        }
    }

    // Recursive method that builds numbers from 1 to n
    private void incre(int n, StringBuilder sb) {
        // Base case: stop when n is 0
        if (n > 0) {
            incre(n - 1, sb); // Recursive call with n-1
            sb.append(n); // Append current number after recursion
        }
    }
}
