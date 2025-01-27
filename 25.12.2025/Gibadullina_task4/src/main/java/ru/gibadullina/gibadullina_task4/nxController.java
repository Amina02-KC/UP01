package ru.gibadullina.gibadullina_task4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import static java.lang.Math.pow;

public class nxController {

    @FXML
    private Label answerLabel;

    @FXML
    private Button exitButton;

    @FXML
    private Button findButton;

    @FXML
    private Label inputdataLabel;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resLabel;

    @FXML
    private ImageView screenshotImageView;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void exitButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void findButtonOnAction(ActionEvent event) {
        int x = Integer.parseInt(xTextField.getText().toString());
        int n = Integer.parseInt(nTextField.getText().toString());
        double res = 1;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            for (int f = 1; f <= i; f++) {
                j = j * f;
            }
            res = res + pow(x, i) / j;
        }

        if (res != 0) {
            resLabel.setText(String.valueOf(res));
        }
        else {
            resLabel.setText("Некорректное число");
        }
    }

}
