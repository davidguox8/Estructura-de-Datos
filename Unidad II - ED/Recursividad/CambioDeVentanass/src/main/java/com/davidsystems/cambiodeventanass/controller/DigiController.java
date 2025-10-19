package com.davidsystems.cambiodeventanass.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DigiController {

    @FXML
    private TextField txtNumber; // Text field where user enters a number

    @FXML
    private Label lblResult; // Label where result will be displayed

    // Method executed when button is clicked
    @FXML
    private void countDigits() {
        try {
            int n = Integer.parseInt(txtNumber.getText()); // Convert input text to integer
            if (n <= 0) {
                lblResult.setText("Please enter a positive number"); // Validation message
                return;
            }
            int count = digi(n); // Call recursive method
            lblResult.setText("The number " + n + " has " + count + " digits."); // Display result
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number"); // Error if input is not numeric
        }
    }

    // Recursive method that counts digits of a number
    private int digi(int num) {
        if (num <= 0) // Base case: stop when number is 0
            return 0;
        return 1 + digi(num / 10); // Recursive call removing the last digit
    }
}
