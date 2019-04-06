package shoemake16;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ConvertNums extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane(); // create new gridpane
		Label lblDec = new Label("Decimal"); // create labels
		Label lblHex = new Label("Hex");
		Label lblBin = new Label("Binary");
		TextField tfDec = new TextField(); // create textfields to hold numbers
		TextField tfHex = new TextField();
		TextField tfBin = new TextField();
		GridPane.setConstraints(lblDec, 0, 0); // set column and row for labels and textfields
		GridPane.setConstraints(tfDec, 1, 0);
		GridPane.setConstraints(lblHex, 0, 1);
		GridPane.setConstraints(tfHex, 1, 1);
		GridPane.setConstraints(lblBin, 0, 2);
		GridPane.setConstraints(tfBin, 1, 2);
		gridPane.getChildren().addAll(lblDec, tfDec, lblHex, tfHex, lblBin, tfBin); // add labels and textfields to gridpane
		
		gridPane.setHgap(10); // horizontal padding
		gridPane.setVgap(10); //vertical padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		
		tfDec.setOnAction(e -> { // upon pressing enter in decimal textfield, update binary and hex textfields
			String numDec = tfDec.getText();
			int myDec = Integer.parseInt(numDec);
			tfHex.setText(Integer.toHexString(myDec));
			tfBin.setText(Integer.toBinaryString(myDec));
		});
		
		tfHex.setOnAction(e -> { // upon pressing enter in hex textfield, update decimal and binary textfields
			String numHex = tfHex.getText();
			int myHex = Integer.parseInt(numHex, 16);
			tfDec.setText(Integer.toString(myHex));
			tfBin.setText(Integer.toBinaryString(myHex));
		});
		
		tfBin.setOnAction(e -> { // upon pressing enter in binary textfield, update decimal and hex textfields
			String numBin = tfBin.getText();
			int myBin = Integer.parseInt(numBin, 2);
			tfDec.setText(Integer.toString(myBin));
			tfHex.setText(Integer.toHexString(myBin));
		});
		
		Scene scene = new Scene(gridPane, 250, 125);
		primaryStage.setTitle("Convert Numbers"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
