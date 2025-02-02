package ru.gibadullina.gibadullina_task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setTitle("Практическая работа №1");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField aTextField = new TextField();
        TextField bTextField = new TextField();
        TextField cTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();
        Label res2Label = new Label();

        calcButton.setOnAction(event -> {
            try {
                int a = Integer.parseInt(aTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                int c = Integer.parseInt(cTextField.getText());
                int v = a * b * c;
                int s = 2 * ((a * b) + (b * c) + (a * c));
                resLabel.setText("V = " + v);
                res2Label.setText("S = " + s);
            } catch (ArithmeticException e) {
                resLabel.setText("Деление на ноль");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("A="), aTextField, new Label("B="), bTextField, new Label("C="), cTextField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resLabel, res2Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 600, 600);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField x1TextField = new TextField();
        TextField y1TextField = new TextField();
        TextField x2TextField = new TextField();
        TextField y2TextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();
        Label res2Label = new Label();

        calcButton.setOnAction(event->{
            try {
                int x1 = Integer.parseInt(x1TextField.getText());
                int y1 = Integer.parseInt(y1TextField.getText());
                int x2 = Integer.parseInt(x2TextField.getText());
                int y2 = Integer.parseInt(y2TextField.getText());
                int a = Math.abs(x2 - x1);
                int b = Math.abs(y2 - y1);
                int s = a * b;
                int p = 2 * (a + b);
                resLabel.setText("S = " + s);
                res2Label.setText("P = " + p);
            }
            catch (NumberFormatException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x1 = "), x1TextField, new Label("y1 = "), y1TextField);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("x2 = "), x2TextField, new Label("y2 = "), y2TextField);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resLabel, res2Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 600, 600);
    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField kgchocoTextField = new TextField();
        TextField pricechocoTextField = new TextField();
        TextField kgtoffeeTextField = new TextField();
        TextField pricetoffeeTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();
        Label res2Label = new Label();
        Label res3Label = new Label();

        calcButton.setOnAction(event->{
            try {
                int x = Integer.parseInt(kgchocoTextField.getText());
                int a = Integer.parseInt(pricechocoTextField.getText());
                int y = Integer.parseInt(kgtoffeeTextField.getText());
                int b = Integer.parseInt(pricetoffeeTextField.getText());
                int c = a / x;
                int d = b / y;
                int comp = c / d;
                resLabel.setText("1 кг конфет = " + c);
                res2Label.setText("1 кг ирисок = " + d);
                res3Label.setText(" " + comp);
            }
            catch (NumberFormatException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("кг конфет:"), kgchocoTextField, new Label("стоимость:"), pricechocoTextField);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("кг ирисок:"), kgtoffeeTextField, new Label("стоимость:"), pricetoffeeTextField);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resLabel, res2Label, res3Label, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 600, 600);
    }

    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField xTextField = new TextField();
        TextField bTextField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resLabel = new Label();

        calcButton.setOnAction(event->{
            try {
                int x = Integer.parseInt(xTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                double z = Math.pow(x, 2) + Math.pow(b, 2);
                double a = Math.pow(x, 6) + Math.cbrt((z * Math.pow(x, 4)) + Math.cos(x + z));
                resLabel.setText("a = " + a);
            }
            catch (NumberFormatException e) {
                resLabel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x = "), xTextField, new Label("b = "), bTextField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 600, 600);
    }
    public static void main(String[] args) {
        launch();
    }
}