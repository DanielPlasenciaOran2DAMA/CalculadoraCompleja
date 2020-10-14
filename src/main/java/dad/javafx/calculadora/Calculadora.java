package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {
	
	private TextField aText, bText, cText, dText, resulRealText, resulImaginarioText;
	private Label masLabel, complejoLabel;
	private String suma = new String("+");
	private String resta = new String("-");
	private String multiplicacion = new String("*");
	private String divison = new String("/");
	private String[] operandos = { suma, resta, multiplicacion, divison };
	private ComboBox<String> operandosCombo;
	private Separator lineaSeparator;

	public void start(Stage primaryStage) throws Exception {
		operandosCombo = new ComboBox<String>();
		operandosCombo.getItems().addAll(operandos);
		operandosCombo.getSelectionModel().selectFirst();
		
		aText = new TextField("0");
		aText.setMaxWidth(50);
		
		masLabel = new Label();
		masLabel.setText("+");
		
		bText = new TextField("0");
		bText.setMaxWidth(50);
		
		complejoLabel = new Label();
		complejoLabel.setText("i");
		
		cText = new TextField("0");
		cText.setMaxWidth(50);
		
		masLabel = new Label();
		masLabel.setText("+");
		
		dText = new TextField("0");
		dText.setMaxWidth(50);
		
		complejoLabel = new Label();
		complejoLabel.setText("i");
		
		lineaSeparator = new Separator();
		lineaSeparator.setMaxWidth(50);
		
		resulRealText = new TextField("0");
		resulRealText.setMaxWidth(50);
		
		masLabel = new Label();
		masLabel.setText("+");
		
		resulImaginarioText = new TextField("0");
		resulImaginarioText.setMaxWidth(50);
		
		complejoLabel = new Label();
		complejoLabel.setText("i");
		
		VBox operandosVbox = new VBox();
		operandosVbox.setAlignment(Pos.CENTER);
		operandosVbox.setSpacing(5);
		operandosVbox.getChildren().addAll(operandosCombo);
		
		HBox primeraOperacionBox = new HBox();
		primeraOperacionBox.setAlignment(Pos.CENTER);
		primeraOperacionBox.setSpacing(5);
		primeraOperacionBox.getChildren().addAll(aText, bText);
		
		HBox segundaOperacionBox = new HBox();
		segundaOperacionBox.setAlignment(Pos.CENTER);
		segundaOperacionBox.setSpacing(5);
		segundaOperacionBox.getChildren().addAll(cText, dText);
		
		HBox resultadoBox = new HBox();
		resultadoBox.setAlignment(Pos.CENTER);
		resultadoBox.setSpacing(5);
		resultadoBox.getChildren().addAll(resulRealText, resulImaginarioText);
		
		VBox operacionesVbox = new VBox();
		operacionesVbox.setAlignment(Pos.CENTER);
		operacionesVbox.setSpacing(5);
		operacionesVbox.getChildren().addAll(primeraOperacionBox, segundaOperacionBox, resultadoBox);
		
		HBox root = new HBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(operandosVbox, operacionesVbox);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("CalculadoraView.fxml");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
