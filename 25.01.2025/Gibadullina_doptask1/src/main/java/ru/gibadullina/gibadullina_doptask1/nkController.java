package ru.gibadullina.gibadullina_doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class nkController {

    @FXML
    private Label answerLabel;

    @FXML
    private Button calcButton;

    @FXML
    private Label dataLabel;

    @FXML
    private TextField kTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        int k = Integer.parseInt(kTextField.getText().toString());
        double s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + pow(i, k);
        }
        resLabel.setText(String.valueOf(s));
    }

}
