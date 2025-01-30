package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class FourthController {

    @FXML
    private Button backButton;

    @FXML
    private DatePicker calendarDatePicker;

    @FXML
    private Button cancelButton;

    @FXML
    private ChoiceBox<?> countryChoiceBox;

    @FXML
    private TextField doublepassTextField;

    @FXML
    private ChoiceBox<?> genderChoiceBox;

    @FXML
    private Button logoutButton;

    @FXML
    private TextField mailTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField passTextField;

    @FXML
    private ImageView photoImageView;

    @FXML
    private TextField photoTextField;

    @FXML
    private Button registerButton;

    @FXML
    private Button showButton;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    void registerButtonOnAction(ActionEvent event) {
        String mail = mailTextField.getText();
        String password = passTextField.getText();
        String doublepassword = doublepassTextField.getText();
        String name = nameTextField.getText();
        String surname = surnameTextField.getText();

        if (doublepassword.equals(password)) {
            showFifthStage("fifthpage_view.fxml", "Marathon Skills 2016 - Register for an event");
        }
        else {
            passTextField.setText("Ошибка");
            doublepassTextField.setText("Введите заново");
        }

        if (name == "" && surname == "") {
            nameTextField.setText("Введите данные");
            surnameTextField.setText("Введите данные");
        }
        else {
            showFifthStage("fifthpage_view.fxml", "Marathon Skills 2016 - Register for an event");
        }
    }

    @FXML
    void showButtonOnAction(ActionEvent event) {

    }
    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
