package ru.gibadullina.gibadullina_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;


public class CircleElementsController {

    @FXML
    private Button calcButton;

    @FXML
    private Label numLabel;

    @FXML
    private TextField numTextField;

    @FXML
    private Label res2Label;

    @FXML
    private Label res3Label;

    @FXML
    private Label resLabel;

    @FXML
    private Label title2Label;

    @FXML
    private Label titleLabel;

    @FXML
    private Label valueLabel;

    @FXML
    private TextField valueTextField;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(numTextField.getText());
        float value = Float.parseFloat(valueTextField.getText());

        float d;
        float l;
        float s;

        d = 2 * value;
        l = (float) (2 * PI * value);
        resLabel.setText("D = " + d);
        res2Label.setText("l = " + l);
        res3Label.setText("R = " + value);


        float n = num % 4;
        if (num <= 4) {

            switch ((int) n) {
                case 1:
                  d = 2 * value;
                  l = (float) (2 * PI * value);
                  s = (float) (PI * pow(value, 2));
                  resLabel.setText("D = " + d);
                  res2Label.setText("l = " + l);
                  res3Label.setText("S = " + s);
                  break;

                case 2:
                    l = (float) (2 * PI * value);
                    s = (float) (PI * pow(value, 2));
                    resLabel.setText("R = " + value);
                    res2Label.setText("l = " + l);
                    res3Label.setText("S = " + s);
                    break;

                case 3:
                    d = 2 * value;
                    s = (float) (PI * pow(value, 2));
                    resLabel.setText("D = " + d);
                    res2Label.setText("R = " + value);
                    res3Label.setText("S = " + s);
                    break;

            }
        }
        else {
            resLabel.setText("Введите номер элемента в диапазоне 1-4");
            res2Label.setText(" ");
            res3Label.setText(" ");
        }
    }

}
