package ru.gibadullina.gibadullina_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bankController {

    @FXML
    private Button calcButton;

    @FXML
    private Label kLabel;

    @FXML
    private Label pLabel;

    @FXML
    private TextField pTextField;

    @FXML
    private Label sLabel;

    @FXML
    void calcButtonOnAction(ActionEvent event) {
        double p = Double.parseDouble(pTextField.getText());
        double s = 1000;
        int k = 0;

        if (p > 0 && p < 25) {
            while (s <= 1100) {
                s = s + p;
                k = k + 1;
            }
            kLabel.setText("Кол-во месяцев = " + k);
            sLabel.setText("Размер вклада = " + s);
        }
        else {
            kLabel.setText("Процент должен быть в диапазоне 1-24");
            sLabel.setText(" ");
        }
    }

}
