package com.example.laba3barabash;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label settedText;
    @FXML
    private TextField inputField;
    @FXML
    protected void onSetButtonClick() {
        settedText.setText(inputField.getText());
    }
    @FXML
    protected void onExitClick() {
        Platform.exit();
    }
}