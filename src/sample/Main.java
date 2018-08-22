package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


        @Override
        public void start(Stage stage) throws Exception{

            //control nodes
            //labels
            Label input,rsltslb, title;
            //textField
            TextField valueToConvert,results;
            //conversion button
            Button convrt;

            //instantiate control nodes
            input = new Label("Miles");
            results = new TextField();

            //results.setText("1.60934");

            rsltslb = new Label("Kilometers");

            title = new Label("Length Converter");

            valueToConvert = new TextField();

            //initialise


            convrt = new Button ("Convert");

            valueToConvert.setMinHeight(30);
            valueToConvert.setMinWidth(150);
            results.setMinHeight(30);
            results.setMinWidth(150);

            convrt.setMinWidth(150);
            convrt.setMinHeight(30);

            //perform conversion
            convrt.setOnAction(e ->{

                    if(valueToConvert.getText().equals("")){

                        Double output = Double.parseDouble(results.getText());

                        double answ = output / 1.60934;
                        valueToConvert.setText(String.valueOf(answ));

                    }else {


                        Double output = Double.parseDouble(valueToConvert.getText());

                        double answ = output * 1.60934;
                        results.setText(String.valueOf(answ));
                    }

            });


//my grid pane with all control nodes
            GridPane mygrid = new GridPane();
            mygrid.add(title,0,0,2,1);
            mygrid.add(input, 0, 1, 1, 1);
            mygrid.add(valueToConvert,0,2,1,1);
            mygrid.add(rsltslb, 0, 3, 1, 1);
            mygrid.add(results, 0, 4, 1, 1);
            mygrid.add(convrt,0,5,1,1);
            mygrid.setVgap(15);
            mygrid.setAlignment(Pos.CENTER);


            //css code

            title.setStyle("-fx-font: normal bold 20px 'serif' ;");

            rsltslb.setStyle("-fx-font: normal 15px 'serif' ;");

            input.setStyle("-fx-font: normal 15px 'serif' ;");

            //results.setStyle(" -fx-text-fill: whitesmoke; -fx-background-color:gray; -fx-font: normal 20px 'serif' ;-fx-border-color:black;");

            convrt.setStyle("-fx-background-color: gray; -fx-arc-height: 10px; -fx-arc-width: 10px;-fx-text-fill: whitesmoke;-fx-text-alignment: center;");

            //scene

            Scene scene = new Scene(mygrid, 500,400);

            //set stage
            stage.setTitle("Converter");
            stage.setMinHeight(500);
            stage.setMinWidth(400);
            stage.setScene(scene);
            stage.show();


        }



    public static void main(String[] args) {
        launch(args);
    }
}
