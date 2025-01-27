package ru.gibadullina.gibadullina_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgeController {

    @FXML
    private Label ageLabel;

    @FXML
    private Button describeButton;

    @FXML
    private Label numLabel;

    @FXML
    private TextField numTextField;

    @FXML
    private Label rangeLabel;

    @FXML
    void describeButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(numTextField.getText().toString());

        int tens = num / 10;
        int units = num % 10;
        String t = " ";
        String u = " ";

        if (num > 20 || num < 69) {
            switch (tens) {
                case 2:
                    t = "Двадцать ";
                    break;
                case 3:
                    t = "Тридцать ";
                    break;
                case 4:
                    t = "Сорок ";
                    break;
                case 5:
                    t = "Пятьдесят ";
                    break;
                case 6:
                    t = "Шестьдесят ";
                    break;
            }
            switch (units) {
                case 0:
                    u = "лет";
                    break;
                case 1:
                    u = "1 год";
                    break;
                case 2:
                    u = "два года";
                    break;
                case 3:
                    u = "три года";
                    break;
                case 4:
                    u = "четыре года";
                    break;
                case 5:
                    u = "пять лет";
                    break;
                case 6:
                    u = "шесть лет";
                    break;
                case 7:
                    u = "семь лет";
                    break;
                case 8:
                    u = "восемь лет";
                    break;
                case 9:
                    u = "девять лет";
                    break;
            }
        }

        ageLabel.setText(t + u);
    }

}
