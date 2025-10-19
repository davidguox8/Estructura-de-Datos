package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TrianguloController {

    @FXML
    private TextField txtSize; // Text field to enter triangle size

    @FXML
    private ChoiceBox<String> choiceType; // ChoiceBox to select type (Creciente or Decreciente)

    @FXML
    private TextArea txtResult; // TextArea to display the triangle

    /**
     * Method triggered when the button is clicked
     */
    @FXML
    protected void generateTriangle() {
        try {
            int n = Integer.parseInt(txtSize.getText()); // Get size
            String tipo = choiceType.getValue(); // Get selected type

            txtResult.clear(); // Clear previous result

            if ("Creciente".equals(tipo)) {
                tri_tipo1(n); // Call increasing triangle
            } else if ("Decreciente".equals(tipo)) {
                tri_tipo2(n); // Call decreasing triangle
            } else {
                txtResult.setText("Please select a triangle type.");
            }

        } catch (NumberFormatException e) {
            txtResult.setText("Please enter a valid integer for size.");
        }
    }

    /**
     * Recursive helper method that prints a single row with n stars
     */
    private void trian(int n) {
        if (n > 0) {
            txtResult.appendText("* ");
            trian(n - 1);
        } else {
            txtResult.appendText("\n");
        }
    }

    /**
     * Increasing triangle
     */
    private void tri_tipo1(int n) {
        if (n > 0) {
            tri_tipo1(n - 1);
            trian(n);
        }
    }

    /**
     * Decreasing triangle
     */
    private void tri_tipo2(int n) {
        if (n > 0) {
            trian(n);
            tri_tipo2(n - 1);
        }
    }
}