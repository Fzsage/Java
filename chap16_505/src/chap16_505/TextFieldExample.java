package chap16_505;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		TextField tfNumber = new TextField();
		Button btProcess = new Button("Process");
		HBox hBox = new HBox();
		Label lblOutput = new Label("");
		hBox.getChildren().addAll(btProcess, tfNumber, lblOutput);
		pane.setBottom(hBox);
		TextArea taTable = new TextArea();
		taTable.setPrefColumnCount(30);
		taTable.setPrefRowCount(12);
		ScrollPane scroll = new ScrollPane(taTable);
		pane.setCenter(scroll);

		/*btProcess.setOnAction(e -> {
			for (int i = 1; i < 12; i++) {
				String line = String.format("%12d %12d %12d\n", i, i * i, i * i * i);
				taTable.setText(taTable.getText() + line);
			}
		});*/

		tfNumber.setOnAction(e -> {
			String num = tfNumber.getText();
			int myInt = Integer.parseInt(num, 2);
			lblOutput.setText(Integer.toString(myInt));
		});

		Scene scene = new Scene(pane, 450, 150);
		primaryStage.setTitle("Conversion"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
