package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class FifthController {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private CheckBox contributionCheckBox;

    @FXML
    private ChoiceBox<?> contributionChoiceBox;

    @FXML
    private CheckBox fullmarCheckBox;

    @FXML
    private CheckBox halfmarCheckBox;

    @FXML
    private CheckBox littlemarCheckBox;

    @FXML
    private Button logoutButton;

    @FXML
    private Button registerButton;

    @FXML
    private TextField sumTextField;

    @FXML
    private Label sumvalueLabel;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private RadioButton varARadioButton;

    @FXML
    private RadioButton varBRadioButton;

    @FXML
    private RadioButton varCRadioButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showFourthStage("fourthpage_view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void registerButtonOnAction(ActionEvent event) {
        showSixthStage("sixthpage_view.fxml", "Marathon Skills 2016 - Registration confirmation");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
