package shoemake14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gridpane extends Application {

	// set primary stage
 @Override
 public void start(Stage primaryStage)  {
  GridPane pane = new GridPane(); // new gridpane
  
 
  
  pane.add(new ImageView(new Image("image/ca.gif")),1,0); // add images to gridpane
  pane.add(new ImageView(new Image("image/china.gif")),0,1);
  pane.add(new ImageView(new Image("image/us.gif")),1,1);
  pane.add(new ImageView(new Image("image/uk.gif")),0,0);
 
  Scene scene = new Scene(pane, 1000, 500); // set scene
  primaryStage.setTitle("Grid Flags"); 
  primaryStage.setScene(scene); // add scene to stage
  primaryStage.show();
 }

 public static void main(String[] args) {
  launch(args);
 }
}