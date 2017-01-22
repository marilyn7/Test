import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Marilyn on 22.01.2017.
 */

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        StackPane stackPane = new StackPane();
        BorderPane borderPane = new BorderPane();
        stackPane.getChildren().addAll(borderPane);
        Scene scene1 = new Scene(stackPane, 500, 500);
        primaryStage.setScene(scene1);

        Circle ring = new Circle();
        ring.setFill(Color.MAGENTA);
        stackPane.getChildren().add(ring);

        TextField xKoordinaat = new TextField();
        xKoordinaat.setPromptText("Sisesta x koordinaat");
        xKoordinaat.textProperty().addListener((observable, vanaX, uusX) -> {
            System.out.println("Uus väärtus: " + uusX);
            String x = xKoordinaat.getText();
            if (Double.parseDouble(x) > 250 || Double.parseDouble(x) < -250) {
                xKoordinaat.clear();
            } else {
                ring.setTranslateX(Double.parseDouble(x));
            }

        });
        TextField yKoordinaat = new TextField();
        yKoordinaat.setPromptText("Sisesta y koordinaat");
        yKoordinaat.textProperty().addListener((observable, vanaY, uusY) -> {
            System.out.println("Uus väärtus: " + uusY);
            String y = yKoordinaat.getText();
            if (Double.parseDouble(y) > 100 || Double.parseDouble(y) < -250) {
                yKoordinaat.clear();
            } else {
                ring.setTranslateY(Double.parseDouble(y));
            }
        });
        TextField raadiusVali = new TextField();
        raadiusVali.setPromptText("Raadius");
        raadiusVali.textProperty().addListener((observable, vanaraadius, uusraadius) -> {
            System.out.println("Uus väärtus: " + uusraadius);
            String raadius = raadiusVali.getText();
            ring.setRadius(Double.parseDouble(raadius));
        });
        VBox vBox = new VBox(raadiusVali, xKoordinaat, yKoordinaat);
        vBox.setSpacing(5);
        borderPane.setBottom(vBox);

        primaryStage.show();
    }
}

