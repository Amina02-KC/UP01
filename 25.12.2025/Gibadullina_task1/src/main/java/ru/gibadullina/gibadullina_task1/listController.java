package ru.gibadullina.gibadullina_task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

public class listController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private Label dataLabel;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private Label inputdataLabel;

    @FXML
    private TextField numTextField;

    @FXML
    private Button okButton;

    @FXML
    private Label resLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void okButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int min = 30000;

        for (int i = 0; i < data.size(); i++) {
            int n = data.get(i);
            if (n % 3 == 0 && n < min) {
                min = n;
            }
        }
        if (min != 0) {
            resLabel.setText(String.valueOf(min));
        }
        else {
            resLabel.setText("Чисел кратных 3 нет");
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numTextField.setText("");
        }

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
