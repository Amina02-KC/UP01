module ru.gibadullina.gibadullina_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_task6 to javafx.fxml;
    exports ru.gibadullina.gibadullina_task6;
}