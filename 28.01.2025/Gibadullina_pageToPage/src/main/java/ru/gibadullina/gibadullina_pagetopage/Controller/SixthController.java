package ru.gibadullina.gibadullina_pagetopage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.gibadullina.gibadullina_pagetopage.util.Manager.*;

public class SixthController {

    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button okButton;

    @FXML
    private Label timeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showFifthStage("fifthpage_view.fxml", "Marathon Skills 2016 - Register for an event");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    public void Initialize(URL url, ResourceBundle resourceBundle) {

    }
}
