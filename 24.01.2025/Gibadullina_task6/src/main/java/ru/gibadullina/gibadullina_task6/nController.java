package ru.gibadullina.gibadullina_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class nController {

    @FXML
    private Button defineButton;

    @FXML
    private Label nLabel;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resLabel;

    @FXML
    void defineButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());

        String five = " ";
        
        while (N > 0) {
            int res = N % 10;
            if (res == 5) {
                five = "true";
                break;

            }
            else {
                five = "false";
                break;
            }
        }
        resLabel.setText(" " + five);
    }

}
