package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FactController {

    @FXML
    private TextField txtNumber; // Text field where the user enters a number

    @FXML
    private Label lblResult; // Label to show the factorial result

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void calculateFactorial() {
        try {
            // Get the number entered by the user
            int n = Integer.parseInt(txtNumber.getText());

            // Call the factorial method
            int result = fact(n);

            // Show the result on the label
            lblResult.setText(n + "! = " + result);
        } catch (NumberFormatException e) {
            // Show error if the user does not enter a valid number
            lblResult.setText("Please enter a valid integer.");
        }
    }

    /**
     * Recursive method to calculate factorial of n
     * Example: n=4 -> 4*3*2*1
     */
    private int fact(int n) {
        // Base case: if n <= 1, return 1
        if (n > 1) return n * fact(n - 1);
        else return 1;
    }
}
