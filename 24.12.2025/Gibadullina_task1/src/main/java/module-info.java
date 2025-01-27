module ru.gibadullina.gibadullina_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_task1 to javafx.fxml;
    exports ru.gibadullina.gibadullina_task1;
}