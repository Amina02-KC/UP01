package ru.gibadullina.gibadullina_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LengthController {

    @FXML
    private Button calcButton;

    @FXML
    private Label lengthLabel;

    @FXML
    private TextField lengthTextField;

    @FXML
    private Label numunitLabel;

    @FXML
    private TextField numunitTextField;

    @FXML
    private Label rangeLabel;

    @FXML
    private Label resLabel;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(numunitTextField.getText().toString());
        double len = Double.parseDouble(lengthTextField.getText().toString());

        float res = num % 5;
        if (num <= 5) {

            switch ((int) res) {
                case 0:
                    res = (float) (len / 10);
                    resLabel.setText("Длина отрезка в метрах: " + res);
                    break;
                case 1:
                    res = (float) (len * 1000);
                    resLabel.setText("Длина отрезка в метрах: " + res);
                    break;
                case 2:
                    res = (float) len;
                    resLabel.setText("Длина отрезка в метрах: " + res);
                    break;
                case 3:
                    res = (float) (len / 1000);
                    resLabel.setText("Длина отрезка в метрах: " + res);
                    break;
                case 4:
                    res = (float) (len / 100);
                    resLabel.setText("Длина отрезка в метрах: " + res);
                    break;

            }
        }
        else {
            resLabel.setText("Введите число в диапозоне 1-5");
        }
    }}
