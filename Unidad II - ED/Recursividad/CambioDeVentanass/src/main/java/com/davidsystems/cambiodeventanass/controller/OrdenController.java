package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrdenController {

    @FXML
    private TextField txtWord; // TextField where user enters the word

    @FXML
    private Label lblResult; // Label to display the result

    /**
     * This method is executed when the button is clicked.
     * It gets the word from the TextField, calls the "orden" method,
     * and displays the result in the Label.
     */
    @FXML
    protected void checkWord() {
        String palabra = txtWord.getText();

        if (palabra == null || palabra.isEmpty()) {
            lblResult.setText("Please enter a word.");
            return;
        }

        if (orden(palabra)) {
            lblResult.setText("The word IS alphabetically ordered.");
        } else {
            lblResult.setText("The word is NOT alphabetically ordered.");
        }
    }

    /**
     * Method that checks if a word is alphabetically ordered
     * Example: "abcdef" -> true
     */
    private boolean orden(String cad) {
        cad = cad.toLowerCase();
        if (cad.length() > 1) {
            if (cad.charAt(0) <= cad.charAt(1)) {
                return orden(cad.substring(1)); // Recursive call with substring
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}