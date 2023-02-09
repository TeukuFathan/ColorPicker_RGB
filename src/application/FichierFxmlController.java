package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;

public class FichierFxmlController {
	
	@FXML
	private Pane couleur  = new Pane();
	int r = 0;
	int b = 100;
	int g = 0;
	
	@FXML
	TextField red,blue,green;
	
	@FXML
	public void initialize() {
		couleur.setStyle("-fx-background-color: rgb(" + r + "," + g + ", " + b +" );");
		red.setText("");
		blue.setText("");
		green.setText("");
	}
	

	@FXML
	public void actionAjouter() {
		String contenuR = red.getText();
		String contenuB = blue.getText();
		String contenuG = green.getText();
		r = Integer.parseInt(contenuR); // prob in this cant read the text written 
		b = Integer.parseInt(contenuB);
		g = Integer.parseInt(contenuG);
		couleur.setStyle("-fx-background-color: rgb(" + r + "," + g + ", " + b +" );");
	}
	
	
	@FXML
	public void actionDefiler() {
		
	}
	
}
