module ru.gibadullina.gibadullina_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_task4 to javafx.fxml;
    exports ru.gibadullina.gibadullina_task4;
}