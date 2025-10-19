package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField txtNumber; // Input field

    @FXML
    private Label lblResult; // Label to display result

    // Method executed when the button is clicked
    @FXML
    private void calculateSum() {
        try {
            int n = Integer.parseInt(txtNumber.getText()); // Convert input to integer
            if (n < 1) {
                lblResult.setText("Please enter a number greater than 0");
                return;
            }
            int result = sum(n); // Call recursive method
            lblResult.setText("Result: " + result);
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number");
        }
    }

    // Recursive method that calculates the sum from n to 1
    private int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
}
