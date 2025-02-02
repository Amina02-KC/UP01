module ru.gibadullina.gibadullina_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_demo to javafx.fxml;
    exports ru.gibadullina.gibadullina_demo;
}