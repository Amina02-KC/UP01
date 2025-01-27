module ru.gibadullina.gibadullina_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_task3 to javafx.fxml;
    exports ru.gibadullina.gibadullina_task3;
}