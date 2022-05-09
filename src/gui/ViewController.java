package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import model.entities.Conversor;
import model.entities.Moeda;


public class ViewController implements Initializable{

    @FXML
    private Button btCalcular;
    @FXML
    private TextField valorText;
   
    @FXML
    private Label labelResultado;
   
    
    
    @FXML
    private ComboBox<Moeda> comboBoxMoeda1;
    @FXML 
    private ComboBox<Moeda> comboBoxMoeda2;
    private ObservableList<Moeda> obsList;
    
    @FXML 
    void oncomboBoxMoedaAction(ActionEvent event) {
    	labelResultado.setText("");
    	if(comboBoxMoeda1.getValue() != null && comboBoxMoeda2.getValue() != null) {
    		btCalcular.setDisable(false);
    	}
    	
    	
    }

    @FXML
    void onBtCalcularAction(ActionEvent event) {
    	Moeda moeda1 = comboBoxMoeda1.getValue();
    	Moeda moeda2 = comboBoxMoeda2.getValue();
    	Double valor=0.0;
    	if(valorText.getText()!="") {
    		valor = Double.parseDouble(valorText.getText());
    	}
    	Double resultado = Conversor.converter(moeda1, moeda2, valor);
    	labelResultado.setText(String.format("%.2f", resultado));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	List<Moeda> lista = new ArrayList<>();
    	lista.add(Moeda.DOLAR);
    	lista.add(Moeda.EURO);
    	lista.add(Moeda.LIBRA_ESTERLINA);
    	lista.add(Moeda.REAL);
    	
    	obsList = FXCollections.observableArrayList(lista);
    	comboBoxMoeda1.setItems(obsList);
    	comboBoxMoeda2.setItems(obsList);
    	btCalcular.setDisable(true);
    	Restringir.setTextFieldDouble(valorText);
    	Restringir.setTextFieldDouble(valorText);
    }

}
