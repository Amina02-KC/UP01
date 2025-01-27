module ru.gibadullina.gibadullina_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_task5 to javafx.fxml;
    exports ru.gibadullina.gibadullina_task5;
}