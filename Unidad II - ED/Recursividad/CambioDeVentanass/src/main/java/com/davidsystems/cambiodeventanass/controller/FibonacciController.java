package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FibonacciController {

    @FXML
    private TextField txtNumber; // Text field where the user enters the number

    @FXML
    private Label lblResult1; // Label for solution 1 result

    @FXML
    private Label lblResult2; // Label for solution 2 result

    @FXML
    private Label lblResult3; // Label for solution 3 result

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void calculateFibonacci() {
        try {
            // Get the number entered by the user
            int num = Integer.parseInt(txtNumber.getText());

            // Call the three Fibonacci methods
            int res1 = fibonacci1(num);
            int res2 = fibonacci2(num);
            int res3 = fibonacci3(num);

            // Show results in the labels
            lblResult1.setText("Solution 1: Fibonacci of " + num + " = " + res1);
            lblResult2.setText("Solution 2: Fibonacci of " + num + " = " + res2);
            lblResult3.setText("Solution 3: Fibonacci of " + num + " = " + res3);

        } catch (NumberFormatException e) {
            // Show error if user enters invalid data
            lblResult1.setText("Please enter a valid integer.");
            lblResult2.setText("");
            lblResult3.setText("");
        }
    }

    /**
     * Solution 1: Recursive method to calculate Fibonacci
     */
    private int fibonacci1(int n) {
        if (n > 1) return fibonacci1(n - 1) + fibonacci1(n - 2);
        else if (n == 1) return 1;
        else return 0;
    }

    /**
     * Solution 2: Slightly simplified version of Fibonacci
     */
    private int fibonacci2(int n) {
        if (n > 1) return fibonacci2(n - 1) + fibonacci2(n - 2);
        else return n;
    }

    /**
     * Solution 3: Most compact version of Fibonacci
     */
    private int fibonacci3(int n) {
        if (n < 2) return n;
        else return fibonacci3(n - 1) + fibonacci3(n - 2);
    }
}
