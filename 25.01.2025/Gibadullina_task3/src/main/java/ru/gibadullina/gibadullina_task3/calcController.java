package ru.gibadullina.gibadullina_task3;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calcController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label answerLabel;

    @FXML
    private TextField bTextField;

    @FXML
    private Button calcButton;

    @FXML
    private Button exitButton;

    @FXML
    private Label inputdataLabel;

    @FXML
    private Label resLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTextField.getText().toString());
        int b = Integer.parseInt(bTextField.getText().toString());
        int s = 0;

        for (int i = a; i <= b; i++) {
            if (i <= b) {
                s = s + i;
            }
        }
        if (s != 0) {
            resLabel.setText(String.valueOf(s));
        }
        else {
            resLabel.setText("Некорректное число");
        }
    }

    @FXML
    void exitButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
