module ru.gibadullina.homework {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.homework to javafx.fxml;
    exports ru.gibadullina.homework;
}