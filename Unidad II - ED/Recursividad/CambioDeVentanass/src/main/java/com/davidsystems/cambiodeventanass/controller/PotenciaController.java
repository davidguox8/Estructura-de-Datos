package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PotenciaController {

    @FXML
    private TextField txtBase; // Text field for base

    @FXML
    private TextField txtExp; // Text field for exponent

    @FXML
    private Label lblResult; // Label to show the result

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void calculatePower() {
        try {
            // Get base and exponent from user input
            int base = Integer.parseInt(txtBase.getText());
            int exp = Integer.parseInt(txtExp.getText());

            // Call the recursive power function
            int result = poten(base, exp);

            // Show the result in the label
            lblResult.setText(base + " raised to " + exp + " = " + result);

        } catch (NumberFormatException e) {
            // Show error if input is not a valid integer
            lblResult.setText("Please enter valid integers for base and exponent.");
        }
    }

    /**
     * Recursive method that calculates base raised to exp
     */
    private int poten(int base, int exp) {
        if (exp == 0) return 1; // Any number raised to 0 is 1
        return base * poten(base, exp - 1); // Multiply base recursively until exp reaches 0
    }
}