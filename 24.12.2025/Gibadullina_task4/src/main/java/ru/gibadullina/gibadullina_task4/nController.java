package ru.gibadullina.gibadullina_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class nController {

    @FXML
    private Button calcButton;

    @FXML
    private Label numLabel;

    @FXML
    private TextField numTextField;

    @FXML
    private Label resLabel;

    @FXML
    private ImageView titleImageView;

    @FXML
    private Label titleLabel;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(numTextField.getText().toString());
        double res = 0;
        double x=2;

        if (n <= 0) {
            resLabel.setText("Число должно быть больше 0");
        }
        while (n > 0) {
            res = n*(n-x);
            x = x + 2;
        }
        resLabel.setText("N = " + res);
    }

}
