package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DecreController {

    @FXML
    private TextField txtNumber; // Input field where user types the number

    @FXML
    private Label lblResult; // Label to show the result

    // Method executed when button is clicked
    @FXML
    private void printSequence() {
        try {
            int n = Integer.parseInt(txtNumber.getText()); // Convert input text to integer
            if (n < 1) {
                lblResult.setText("Please enter a number greater than 0"); // Validation
                return;
            }
            StringBuilder sb = new StringBuilder(); // Object to store the result string
            decre(n, sb); // Call recursive method
            lblResult.setText("Result: " + sb.toString()); // Show result in label
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number"); // Error if input is not numeric
        }
    }

    // Recursive method that prints numbers from n to 1
    private void decre(int n, StringBuilder sb) {
        if (n > 0) {
            sb.append(n); // Append current number
            decre(n - 1, sb); // Recursive call with n-1
        }
    }
}
