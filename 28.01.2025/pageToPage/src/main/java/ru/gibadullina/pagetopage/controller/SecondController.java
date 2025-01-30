package ru.gibadullina.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gibadullina.pagetopage.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    private Button secgoButton;

    @FXML
    void secgoButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");
    }

}
