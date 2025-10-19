package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BinarioController {

    @FXML
    private TextField txtNumber; // Input field where the user enters a number

    @FXML
    private Label lblSolution1; // Label to display solution 1 (printed style)

    @FXML
    private Label lblSolution2; // Label to display solution 2 (returned style)

    /**
     * This method is executed when the user clicks the button.
     * It takes the number from the TextField, calls both conversion methods,
     * and displays the results in the labels.
     */
    @FXML
    protected void convertToBinary() {
        try {
            int number = Integer.parseInt(txtNumber.getText());

            // Solution 1: prints binary as a string
            StringBuilder result1 = new StringBuilder();
            binario(number, result1); // fills result1 recursively
            lblSolution1.setText(result1.toString());

            // Solution 2: returns binary as an integer
            int result2 = binario2(number);
            lblSolution2.setText(String.valueOf(result2));

        } catch (NumberFormatException e) {
            lblSolution1.setText("Please enter a valid number.");
            lblSolution2.setText("");
        }
    }

    /**
     * Solution 1: recursively builds the binary representation as a string
     */
    private void binario(int n, StringBuilder result) {
        if (n < 2) {
            result.append(n);
        } else {
            binario(n / 2, result);
            result.append(n % 2);
        }
    }

    /**
     * Solution 2: recursively returns the binary representation as an integer
     */
    private int binario2(int n) {
        if (n < 2) {
            return n;
        } else {
            return n % 2 + 10 * binario2(n / 2);
        }
    }
}
