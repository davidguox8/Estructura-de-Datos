package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RecursionController {

    @FXML
    private TextField inputNumber;

    @FXML
    private Label resultLabel;

    @FXML
    private Button calculateButton;

    // This method is called when the button is clicked
    @FXML
    protected void onCalculateClick() {
        try {
            int number = Integer.parseInt(inputNumber.getText()); // Get number from TextField
            long result = factorial(number); // Call recursive method
            resultLabel.setText("Factorial: " + result); // Show result
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid integer");
        }
    }

    // Recursive method to calculate factorial
    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
