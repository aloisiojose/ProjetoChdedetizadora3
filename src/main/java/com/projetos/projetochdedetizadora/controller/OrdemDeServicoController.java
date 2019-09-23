
package com.projetos.projetochdedetizadora.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import static com.projetos.projetochdedetizadora.controller.TelaPrincipalController.icone;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class OrdemDeServicoController implements Initializable {

    @FXML private HBox hbTopo;
    @FXML private ImageView imgViewTitulo;
    @FXML private Label lblTitulo;
    @FXML private HBox hbBase;
    @FXML private Button btnNovo;
    @FXML private Button btnSalvar;
    @FXML private Button btnExcluir;
    @FXML private TableView<?> tableView;
    @FXML private JFXTextField tfId;
    @FXML private JFXTextField tfPesquisar;
    @FXML private CheckBox chAtivo;
    @FXML private JFXDatePicker dpDataPedido;
    @FXML private JFXDatePicker dpDataServico;
    @FXML private JFXTextField tfArea;
    @FXML private JFXComboBox<?> cbVeneno;
    @FXML private JFXTextField tfValor;
    @FXML private JFXComboBox<?> cbCliente;
    @FXML private JFXTextField tfPraga;
    @FXML private JFXComboBox<?> cbFuncionario;
    @FXML private JFXComboBox<?> cbCidade;
    @FXML private JFXComboBox<?> cbLocal;
    @FXML private JFXTextField tfComplemento;
    @FXML private JFXRadioButton rbSitOrcamento;
    @FXML private ToggleGroup situacao;
    @FXML private JFXRadioButton rbModContrato;
    @FXML private ToggleGroup modalidade;
    @FXML private JFXRadioButton rbModOrcamento;
    @FXML private JFXTextField tfGarantia;
    @FXML private TableView<?> tableViewLista;
    @FXML private JFXTextField tfTelefone;
    @FXML private JFXRadioButton rbSitDedetizacao;
    @FXML private JFXRadioButton rbSitGarantia;
    @FXML  private JFXRadioButton rbSitManutencao;
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //-----> Configuração da barra de título do form
        lblTitulo.setText(toUpperCase("gerenciar ordem de Serviço"));
        Image img = new Image(icone);
        imgViewTitulo.setImage(img);      
    }    

    @FXML
    private void novoRegistro(ActionEvent event) {
    }

    @FXML
    private void salvarRegistro(ActionEvent event) {
    }

    @FXML
    private void excluirRegistro(ActionEvent event) {
    }  
    
}
