package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InvertirController {

    @FXML
    private TextField txtNumber; // Text field where user enters the number

    @FXML
    private Label lblResult; // Label to show the inverted number

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void invertNumber() {
        try {
            // Get the number from the text field
            int n = Integer.parseInt(txtNumber.getText());

            // Call the recursive method to invert the number
            String result = invert(n);

            // Show the result in the label
            lblResult.setText("Inverted: " + result);

        } catch (NumberFormatException e) {
            // Show error if the input is not a valid number
            lblResult.setText("Please enter a valid integer.");
        }
    }

    /**
     * Recursive method that returns the digits of the number in reverse order
     */
    private String invert(int n) {
        if (n < 10) {
            // Base case: if number has one digit, return it as string
            return String.valueOf(n);
        } else {
            // Recursive case: take last digit and call function with the rest
            return (n % 10) + invert(n / 10);
        }
    }
}