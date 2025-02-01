package ru.gibadullina.homework;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import static java.lang.Math.*;
import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        primaryStage.setTitle("Task");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold");
        TextField aTextField = new TextField();
        TextField bTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();

        calcButton.setOnAction(event->{
            try {
                int a = Integer.parseInt(aTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                String res = "";
                for (int i = 0; i <= a; i++) {
                    res = res + i;
                }
                resLabel.setText(res);
            }
            catch (ArithmeticException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), aTextField, new Label("b="), bTextField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold");
        TextField aTextField = new TextField();
        TextField bTextField = new TextField();
        TextField cTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();

        calcButton.setOnAction(event->{
            try {
                int a = Integer.parseInt(aTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                int c = Integer.parseInt(cTextField.getText());
                int d = a * b;
                int e = b * c;
                String res = min(d, e) + " " + max(d, e);
                resLabel.setText(res);
            }
            catch (ArithmeticException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), aTextField, new Label("b="), bTextField);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("c="), cTextField);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold");
        TextField xTextField = new TextField();
        TextField yTextField = new TextField();
        TextField mTextField = new TextField();
        TextField nTextField = new TextField();
        TextField aTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();

        calcButton.setOnAction(event->{
            try {
                double x = Double.parseDouble(xTextField.getText());
                double y = Double.parseDouble(yTextField.getText());
                double m = Double.parseDouble(mTextField.getText());
                double n = Double.parseDouble(nTextField.getText());
                double a = Double.parseDouble(aTextField.getText());
                double r = sqrt(pow(x, 2) + pow(y, 2));

                if (pow(m+x, 2) + pow(n+y, 2) <= pow(r, 2) && pow(m+x-a, 2) + pow(n+y, 2) <= pow(r,2) && pow(n+y-a, 2) + pow(m+x-a, 2) <= pow(r, 2)) {
                    resLabel.setText("Принадлежит");
                }
                else {
                    resLabel.setText("Не принадлежит");
                }
            }
            catch (ArithmeticException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x="), xTextField, new Label("y="), yTextField);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("m="), mTextField, new Label("n="), nTextField);
        root3.setAlignment(Pos.CENTER);
        HBox root4 = new HBox(10, new Label("a="), aTextField);
        root4.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, root4, calcButton, resLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }
    public static void main(String[] args) {
        launch();
    }
}