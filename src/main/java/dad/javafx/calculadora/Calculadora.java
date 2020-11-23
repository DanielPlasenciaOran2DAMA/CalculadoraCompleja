package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
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
	private StringProperty suma = new SimpleStringProperty("+");
	private StringProperty resta = new SimpleStringProperty("-");
	private StringProperty multiplicacion = new SimpleStringProperty("*");
	private StringProperty divison = new SimpleStringProperty("/");
	private StringProperty[] operandos = { suma, resta, multiplicacion, divison };
	private ComboBox<StringProperty> operandosCombo;
	private Separator lineaSeparator;

	public void start(Stage primaryStage) throws Exception {
		operandosCombo = new ComboBox<StringProperty>();
		operandosCombo.getItems().addAll(operandos);
		operandosCombo.getSelectionModel().selectFirst();
		
		aText = new TextField("0");
		aText.setMaxWidth(50);
		
		bText = new TextField("0");
		bText.setMaxWidth(50);
		
		cText = new TextField("0");
		cText.setMaxWidth(50);
		
		dText = new TextField("0");
		dText.setMaxWidth(50);
		
		lineaSeparator = new Separator();
		lineaSeparator.setMaxWidth(50);
		
		resulRealText = new TextField("0");
		resulRealText.setMaxWidth(50);
		
		resulImaginarioText = new TextField("0");
		resulImaginarioText.setMaxWidth(50);
		
		VBox operandosVbox = new VBox();
		operandosVbox.setAlignment(Pos.CENTER);
		operandosVbox.setSpacing(5);
		operandosVbox.getChildren().addAll(operandosCombo);
		
		HBox primeraOperacionBox = new HBox();
		primeraOperacionBox.setAlignment(Pos.CENTER);
		primeraOperacionBox.setSpacing(5);
		primeraOperacionBox.getChildren().addAll(aText, new Label("+"), bText, new Label("i"));
		
		HBox segundaOperacionBox = new HBox();
		segundaOperacionBox.setAlignment(Pos.CENTER);
		segundaOperacionBox.setSpacing(5);
		segundaOperacionBox.getChildren().addAll(cText, new Label("+"), dText, new Label("i"));
		
		HBox resultadoBox = new HBox();
		resultadoBox.setAlignment(Pos.CENTER);
		resultadoBox.setSpacing(5);
		resultadoBox.getChildren().addAll(resulRealText, new Label("+"), resulImaginarioText, new Label("i"));
		
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
