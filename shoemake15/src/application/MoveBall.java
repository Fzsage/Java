// This program will place a ball in a scene that can be moved with button clicks, but not past the boundaries of the pane
// Didn't see it necessary to use BallPane class since it can be done solely with an instance of Circle

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class MoveBall extends Application {
	@Override 
	public void start(Stage primaryStage) {

		Circle circle = new Circle(40, 40, 15); // Create new circle or "ball"
		circle.setStroke(Color.BLACK); // Set color of ball
		circle.setFill(Color.BLACK);

		Button leftBt = new Button("Left"); // Create buttons for left, right, up, and down
		Button rightBt = new Button("Right");
		Button upBt = new Button("Up");
		Button downBt = new Button("Down");

		HBox hBox = new HBox(); // Create HBox to contain buttons
		hBox.setSpacing(5); // Set spacing between buttons
		hBox.setAlignment(Pos.CENTER); // Center the hBox
		hBox.getChildren().addAll(leftBt, rightBt, upBt, downBt); // add buttons to hBox

		BorderPane bPane = new BorderPane(); // Create new borderpane to prevent circle going outside and from going past buttons
		bPane.setBottom(hBox); // Set bottom of the borderpane to the buttons
		BorderPane.setAlignment(hBox, Pos.CENTER);
		bPane.getChildren().add(circle); // Add the circle to the borderpane
		 
		
		

		leftBt.setOnMousePressed(e -> { // Event handlers for button clicks which will move in the respective direction
			if (circle.getCenterX() > 15) // Since coordinates start at 0,0 we don't need to relate to bPane for left and up
				circle.setCenterX(circle.getCenterX() - 2); // Move left horizontally 2 pixels
		});

		rightBt.setOnMousePressed(e -> {
			if (circle.getCenterX() < (bPane.getWidth() - 15)) // Get width of bPane and set border for ball to bPane.width - 15 (diameter of circle)
				circle.setCenterX(circle.getCenterX() + 2); // Move right 2 pixels
		});

		upBt.setOnMousePressed(e -> {
			if (circle.getCenterY() > 15)
				circle.setCenterY(circle.getCenterY() - 2);
		});

		downBt.setOnMousePressed(e -> {
			if (circle.getCenterY() < (bPane.getHeight() - 15))
				circle.setCenterY(circle.getCenterY() + 2);
		});

		Scene scene = new Scene(bPane, 300, 150); // Create new scene
		circle.setCenterX((scene.getWidth() / 2)); // Center the circle in the bPane, scene in this case
		circle.setCenterY((scene.getHeight() / 2));
		primaryStage.setTitle("Move The Ball");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
