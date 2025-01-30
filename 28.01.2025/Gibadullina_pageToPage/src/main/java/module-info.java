module ru.gibadullina.gibadullina_pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gibadullina.gibadullina_pagetopage to javafx.fxml;
    exports ru.gibadullina.gibadullina_pagetopage;
    exports ru.gibadullina.gibadullina_pagetopage.Controller;
    opens ru.gibadullina.gibadullina_pagetopage.Controller to javafx.fxml;
}