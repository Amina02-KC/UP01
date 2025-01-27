package ru.gibadullina.gibadullina_task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import static java.lang.Math.*;

public class vuController {

    @FXML
    private Label answerLabel;

    @FXML
    private Button exitButton;

    @FXML
    private Button findButton;

    @FXML
    private Label inputdataLabel;

    @FXML
    private Label resLabel;

    @FXML
    private ImageView scrImageView;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField nTextField;

    @FXML
    void exitButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void findButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText());
        double u, v = 0;
        double u1 = 0, u2 = 0;
        double v1 = 1, v2 = 1;
        for (int i = 3; i <= n; i++){
            u = u2 - u1 * v2 - v1 / (1 + pow(u2, 2) + pow(v2, 2));
            v = u2 - v2 / (Math.abs(u1 + v2) + 2);
            u1 = u2;
            u2 = u;
            v1 = v2;
            v2 = v;
        }
        resLabel.setText(String.valueOf(v));
    }

}
