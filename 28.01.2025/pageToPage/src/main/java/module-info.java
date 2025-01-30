module ru.gibadullina.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.pagetopage to javafx.fxml;
    exports ru.gibadullina.pagetopage;
    exports ru.gibadullina.pagetopage.controller;
    opens ru.gibadullina.pagetopage.controller to javafx.fxml;
}