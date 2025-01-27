module ru.gibadullina.gibadullina_doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_doptask1 to javafx.fxml;
    exports ru.gibadullina.gibadullina_doptask1;
}