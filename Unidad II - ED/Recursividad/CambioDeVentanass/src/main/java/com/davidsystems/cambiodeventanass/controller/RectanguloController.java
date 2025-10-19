package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RectanguloController {

    @FXML
    private TextField txtHeight; // Text field for height

    @FXML
    private TextField txtWidth; // Text field for width

    @FXML
    private TextArea txtResult; // Text area to display the rectangle

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void printRectangle() {
        try {
            // Get height and width from user input
            int altura = Integer.parseInt(txtHeight.getText());
            int base = Integer.parseInt(txtWidth.getText());

            // Clear the text area before printing
            txtResult.clear();

            // Call the recursive method to build the rectangle
            cuad(altura, base);

        } catch (NumberFormatException e) {
            // Show error message if input is invalid
            txtResult.setText("Please enter valid integers for height and width.");
        }
    }

    /**
     * Recursive method that prints each line of the rectangle
     */
    private void cuad(int altura, int base) {
        if (altura > 0) {
            cuad2(base); // Print one row
            cuad(altura - 1, base); // Recursive call for remaining rows
        }
    }

    /**
     * Recursive method that builds one row of the rectangle
     */
    private void cuad2(int n) {
        if (n > 0) {
            txtResult.appendText("* "); // Add star to current row
            cuad2(n - 1); // Continue printing row
        } else {
            txtResult.appendText("\n"); // Move to next line
        }
    }
}