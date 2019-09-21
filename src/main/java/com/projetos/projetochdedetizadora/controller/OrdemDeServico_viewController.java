
package com.projetos.projetochdedetizadora.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author alois
 */
public class OrdemDeServico_viewController implements Initializable {

    @FXML
    private HBox hbTopo;
    @FXML
    private ImageView imgViewTitulo;
    @FXML
    private Label lblTitulo;
    @FXML
    private HBox hbBase;
    @FXML
    private Button btnNovo;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnExcluir;
    @FXML
    private TableView<?> tableView;
    @FXML
    private JFXTextField tfId;
    @FXML
    private JFXTextField tfCelular;
    @FXML
    private JFXTextField tfPesquisar;
    @FXML
    private CheckBox chAtivo;
    @FXML
    private JFXTextField tfCliente;
    @FXML
    private JFXTextField tfFuncionaio;
    @FXML
    private JFXDatePicker dpDataPedido;
    @FXML
    private JFXTextField tfLocal;
    @FXML
    private JFXComboBox<?> cbSituacao;
    @FXML
    private JFXComboBox<?> cbPraga;
    @FXML
    private JFXDatePicker dpDataServico;
    @FXML
    private JFXTextField tfArea;
    @FXML
    private JFXComboBox<?> cbVeneno;
    @FXML
    private JFXComboBox<?> cbModalidade;
    @FXML
    private JFXComboBox<?> cbTempoGarantia;
    @FXML
    private JFXTextField tfValor;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void novoRegistro(ActionEvent event) {
    }

    @FXML
    private void salvarRegistro(MouseEvent event) {
    }

    @FXML
    private void salvarRegistro(ActionEvent event) {
    }

    @FXML
    private void excluirRegistro(ActionEvent event) {
    }
    
}
