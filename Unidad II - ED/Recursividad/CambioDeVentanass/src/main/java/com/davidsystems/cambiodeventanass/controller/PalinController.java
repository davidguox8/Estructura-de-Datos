package com.davidsystems.cambiodeventanass.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PalinController {

    @FXML
    private TextField txtWord; // TextField where user enters the word

    @FXML
    private Label lblResult; // Label to display the result

    /**
     * This method is executed when the button is clicked.
     * It gets the word from the TextField, calls the "palin" method,
     * and displays the result in the Label.
     */
    @FXML
    protected void checkPalindrome() {
        String palabra = txtWord.getText();

        if (palabra == null || palabra.isEmpty()) {
            lblResult.setText("Please enter a word.");
            return;
        }

        if (palin(palabra)) {
            lblResult.setText("It IS a palindrome.");
        } else {
            lblResult.setText("It is NOT a palindrome.");
        }
    }

    /**
     * Method that checks if a word is a palindrome
     * Example: "reconocer" -> true
     */
    private boolean palin(String frase) {
        frase = frase.toLowerCase();
        if (frase.length() <= 1) {
            return true; // Base case: one or zero characters is always palindrome
        } else {
            if (frase.charAt(0) == frase.charAt(frase.length() - 1)) {
                // Recursive call removing first and last character
                return palin(frase.substring(1, frase.length() - 1));
            } else {
                return false;
            }
        }
    }
}