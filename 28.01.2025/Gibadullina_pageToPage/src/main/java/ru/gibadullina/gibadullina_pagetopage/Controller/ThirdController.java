package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class ThirdController {

    @FXML
    private Label autorLabel;

    @FXML
    private Label autorwarnLabel;

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("secondpage_view.fxml", "Marahon Skills 2016 - Register as a runner");
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showSecondStage("secondpage_view.fxml", "Marahon Skills 2016 - Register as a runner");
    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        String email = emailTextField.getText();
        String pass1 = passwordTextField.getText();
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
