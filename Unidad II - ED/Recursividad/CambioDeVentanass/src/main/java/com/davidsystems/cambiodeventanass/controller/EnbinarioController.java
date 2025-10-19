package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EnbinarioController {

    @FXML
    private TextField txtNumber; // Input field where the user enters a number

    @FXML
    private Label lblResult; // Label to display the result

    /**
     * This method is executed when the button is clicked.
     * It gets the number from the TextField, checks if it is binary,
     * and displays the result.
     */
    @FXML
    protected void checkIfBinary() {
        try {
            int number = Integer.parseInt(txtNumber.getText());

            if (enBinario(number)) {
                lblResult.setText("The number IS in binary.");
            } else {
                lblResult.setText("The number is NOT in binary.");
            }

        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid integer.");
        }
    }

    /**
     * Recursive method that checks if a number is binary
     * Example: 101011 -> true
     */
    private boolean enBinario(int n) {
        if (n > 9) {
            if (n % 10 == 0 || n % 10 == 1) {
                return enBinario(n / 10); // Recursive call removing last digit
            } else {
                return false; // Found a digit different from 0 or 1
            }
        } else if (n == 0 || n == 1) {
            return true; // Base case: one digit and it is 0 or 1
        } else {
            return false; // Last digit was not 0 or 1
        }
    }
}