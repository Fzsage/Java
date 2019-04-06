package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InnerClassGui extends Application {
	private TextField tfQuantity;
	private TextField tfPrice;
	private Label extPrice;

	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane pane = new GridPane();
			pane.setPadding(new Insets(10, 10, 10, 10));
			pane.setHgap(5);
			pane.setVgap(5);
			pane.add(new Label("Quantity"), 0, 0);
			tfQuantity = new TextField();
			pane.add(tfQuantity, 1, 0);
			pane.add(new Label("Price"), 0, 1);
			tfPrice = new TextField();
			pane.add(tfPrice, 1, 1);
			Button btProcess = new Button("Process");
			pane.add(btProcess, 0, 2);
			extPrice = new Label();
			pane.add(extPrice, 1, 2);
			
			GUIHandler handler = new GUIHandler();
			btProcess.setOnAction(handler);

			Scene scene = new Scene(pane);
			primaryStage.setTitle("Orinoco");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	class GUIHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			int qty = Integer.parseInt(tfQuantity.getText());
			double price = Double.parseDouble(tfPrice.getText());
			double total = qty * price;
			extPrice.setText("Please pay " + Double.toString(total));
			
			
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
