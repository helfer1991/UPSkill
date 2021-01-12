package com.mycompany.pl17;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    private String[] letras = {"A", "B", "C", "D", "E", "F", "G"};
    private List<String> letrasParaLabel = new ArrayList<>();
    private int qtLetras = 3; //3 para aparecer no ecra 3 letras por pre-definicao
    private Label label;
    
    @FXML
    private Label labelQuantidadeLetras;
    @FXML
    private TextField inputLetras;
    @FXML
    private Button btnConfirmar;
    @FXML
    private Button btnShiftLeft;
    @FXML
    private Label mainContainer;
    @FXML
    private Button btnShiftRight;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mudarLetrasParaLabel();
        mostraLetras();
    }    

    @FXML
    private void trataEventoInputLetras(ActionEvent event) {

    }

    @FXML
    private void trataEventoConfirmar(ActionEvent event) {
        try {
            qtLetras = Integer.parseInt(inputLetras.getText().trim());
            if(qtLetras >= 3 && qtLetras <= 7) {
                mudarLetrasParaLabel();
                mostraLetras();
            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Shifts");
                alerta.setHeaderText("O numero deve ser maior do que 2 e inferior a 8");
                alerta.setContentText("Valor invalido");
                alerta.showAndWait();
            } 
        } catch(NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Shifts");
            alerta.setHeaderText("Deves introduzir um numero");
            alerta.setContentText("Valor invalido");
            alerta.showAndWait();
        }
        inputLetras.clear();
    }

    @FXML
    private void handlePrev(ActionEvent event) { //aqui ja cliquei em confirmar, logo ja tenho 3, 4, etc letras no ecra
        String primeiraLetra = letrasParaLabel.get(0);
        letrasParaLabel.remove(0);
        letrasParaLabel.add(letrasParaLabel.size(), primeiraLetra);
        mostraLetras();
    }

    @FXML
    private void handleNext(ActionEvent event) { //aqui ja cliquei em confirmar, logo ja tenho 3, 4, etc letras no ecra
        String primeiraLetra = letrasParaLabel.get(letrasParaLabel.size() - 1);
        letrasParaLabel.remove(letrasParaLabel.size()-1);        
        letrasParaLabel.add(0,primeiraLetra);
        mostraLetras();
    }
    
    private void mostraLetras() {
        mainContainer.setText(null);
        String text = "";
        for(int i = 0; i < qtLetras; i++) {
            text += letrasParaLabel.get(i);
        }
        mainContainer.setText(text);
    }
    
    private void mudarLetrasParaLabel() {
        letrasParaLabel.clear();
        for(int i = 0; i < qtLetras; i++) {
            letrasParaLabel.add(letras[i]);
        }
    }
}
