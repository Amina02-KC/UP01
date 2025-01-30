package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class SecondController {

    @FXML
    private Button backButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button newmemberButton;

    @FXML
    private Button previousmemberButton;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showThirdStage("thirdpage_view.fxml", "Marathon Skills 2016 - Login");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    void newmemberButtonOnAction(ActionEvent event) {
        showFourthStage("fourthpage_view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void previousmemberButtonOnAction(ActionEvent event) {
        showThirdStage("thirdpage_view.fxml", "Marathon Skills 2016 - Login");
    }

    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
