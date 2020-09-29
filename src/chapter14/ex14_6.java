package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

class ex14_6CheckerBoard extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(0);
        pane.setVgap(0);

for(int j = 0; j < 8; j++) {
    for (int i = 0; i < 8; i++) {
        Rectangle square = new Rectangle(30, 30, 30, 30);
        square.setStroke(Color.BLACK);
        if(j%2 == 0 || j%2 == 1){
        if (i % 2 == 0) {
            square.setFill(Color.BLACK);
        } else square.setFill(Color.WHITE);}
        else{if (i % 2 == 0) {
            square.setFill(Color.BLACK);}
        pane.add(square, i, j);

    }

        }
    }
}
public static void main(String[] args){
        launch(args);
}

    }



