package shoemake16;
	
import shoemake16.Loan;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class CompareLoans extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane(); // create new borderpane
		pane.setPadding(new Insets(15, 12, 15, 12)); // set padding for borderpane
	    
		TextField tfAmount = new TextField(); // create textfields for loan amount and number of years
		TextField tfYears = new TextField();
		
		Button btShow = new Button("ShowTable"); // create button for show table
		
		HBox hBox = new HBox(); //  create new hbox, set padding, spacing, and alignment to center
		hBox.setPadding(new Insets(0, 0, 15, 0));
	    hBox.setSpacing(10);
	    hBox.setAlignment(Pos.CENTER);
		
	    Label lblAmount = new Label("Loan Amount"); // create labels for loan amount and number of years
		Label lblYears = new Label("Number of Years");
		
		hBox.getChildren().addAll(lblAmount, tfAmount, lblYears, tfYears, btShow); //  add labels, text fields, and buttons to hbox
		pane.setTop(hBox); // set hbox above borderpane
		
		TextArea taTable = new TextArea(); //  create new text area and set dimensions
		taTable.setPrefColumnCount(67);
		taTable.setPrefRowCount(12);
		taTable.setEditable(false); //  make text in textarea uneditable
		ScrollPane scroll = new ScrollPane(taTable); //  create scrollpane for textarea
		pane.setCenter(scroll);
		
		Loan loanNew = new Loan(0, 0, 0); //  create new instance of loan
		
		
		taTable.setText("Interest rate\t\tMonthly Payment\t\tTotalPayment\n"); // first row of text for table
		
		btShow.setOnAction(e -> { // action when show table button is pressed
			for(double i = 5.0; i <= 8.0; i+= .125){ //  set loop to interest rate, increment by .125 5-8
				int amount = Integer.parseInt(tfAmount.getText());
				double amountNew = amount; //  set to double to allow methods in Loan class to calculate
				loanNew.setLoanAmount(amountNew); // set loan amount to amount entered in text field
				int years = Integer.parseInt(tfYears.getText());
				loanNew.setNumberOfYears(years); //  set loan duration to amount entered in text field
				loanNew.setAnnualInterestRate(i); // set interest amount to iteration variable
				String line = String.format("%.3f\t\t\t%.2f\t\t\t\t%.2f\n", i, loanNew.getMonthlyPayment(), loanNew.getTotalPayment()); 
				taTable.setText(taTable.getText() + line); //  print interest, monthly payment, and total payment
			}
		});
		
		Scene scene = new Scene(pane, 807, 285);
		primaryStage.setTitle("Compare Loans"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
