package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class MainController {

    @FXML
    private Button backButton;

    @FXML
    private Label infoLabel;

    @FXML
    private Button knowmoreButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button runnerButton;

    @FXML
    private Button sponsorButton;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void knowmoreButtonOnAction(ActionEvent event) {

    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showThirdStage("thirdpage_view.fxml", "Marahon Skills 2016 - Login");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    void runnerButtonOnAction(ActionEvent event) {
        showSecondStage("secondpage_view.fxml", "Marahon Skills 2016 - Register as a runner");
    }

    @FXML
    void sponsorButtonOnAction(ActionEvent event) {

    }

    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
