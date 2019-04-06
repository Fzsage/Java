// This program will allow the user to draw a black line within the pane, and not extending outside, using the arrow keys 

package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawLines extends Application {
	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane(); // Create new pane
								

		Polyline line = new Polyline(); // Create new instance of Polyline class used to draw line
		line.setStroke(Color.BLACK); // Set color of line
		pane.getChildren().add(line); // Add polyline to the pane

		ObservableList<Double> list = line.getPoints(); // Create a new listener to record points of the line as it moves
		list.addAll(150.0, 100.0); // Create start point for line, center of pane

		line.setOnKeyPressed(e -> {
			double x = list.get(list.size() - 2); // initiate variables for coordinates
			double y = list.get(list.size() - 1);

			
				switch (e.getCode()) { // Create switch to handle "methods" for directional presses

				case UP:
					if(y >0){list.addAll(x, y - 5); // if statements to handle borders for line
					}                               // pressing up will reduce y coordinate 5 pixels and keep x the same       
					break;
				case DOWN:
					if(y < 200){list.addAll(x, y + 5);
					}
					break;
				case LEFT:
					if(x > 0){list.addAll(x - 5, y);
					}
					break;
				case RIGHT:
					if(x <300){list.addAll(x + 5, y);
					}
					break;
				default:
					System.out.println("Do Nothing");
				}
			
		

		});

		Scene scene = new Scene(pane, 300, 200); // Place pane in scene
		primaryStage.setTitle("Make lines with arrow keys");
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show();

		line.requestFocus(); // Request focus on line to receive key events
	}

	public static void main(String[] args) {
		launch(args);
	}
}
