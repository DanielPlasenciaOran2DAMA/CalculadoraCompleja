package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculadora extends Application {
	
	private TextField a;
	private TextField b;
	private TextField c;
	private TextField d;
	private Label masLabel;
	private Label complejoLabel;
	private StringProperty suma = new SimpleStringProperty("+");
	private StringProperty resta = new SimpleStringProperty("-");
	private StringProperty multiplicacion = new SimpleStringProperty("*");
	private StringProperty divison = new SimpleStringProperty("/");
	private StringProperty[] operaciones = { suma, resta, multiplicacion, divison };
	private ComboBox<String> operacionesCombo;
	private Separator lineaSeparator;

	public void start(Stage primaryStage) throws Exception {
		
	}
}
