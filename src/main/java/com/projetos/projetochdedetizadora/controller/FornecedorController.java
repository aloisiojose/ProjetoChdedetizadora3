package com.projetos.projetochdedetizadora.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import static com.projetos.projetochdedetizadora.controller.TelaPrincipalController.icone;
import static com.projetos.projetochdedetizadora.controller.TelaPrincipalController.titulo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class FornecedorController implements Initializable {

    @FXML private HBox hbTopo;
    @FXML private ImageView imgViewTitulo;
    @FXML private Label lblTitulo;
    @FXML private HBox hbBase;
    @FXML private Button btnNovo;
    @FXML private Button btnSalvar;
    @FXML private Button btnExcluir;
    @FXML private TableView<?> tableView;
    @FXML private CheckBox chAtivo;
    @FXML private JFXTextField tfId;
    @FXML private JFXTextField tfDescricao;
    @FXML private JFXTextField tfCpf;
    @FXML private JFXTextField tfEndereco;
    @FXML private JFXTextField tfNum;
    @FXML private JFXTextField tfComplemento;
    @FXML private JFXComboBox<?> cbCidade;
    @FXML private JFXTextField tfTelefone;
    @FXML private JFXTextField tfCelular;
    @FXML private JFXComboBox<?> cbTipoPessoa;
    @FXML private JFXTextField tfEmail;
    @FXML private JFXTextField tfObservacao;
    @FXML private JFXTextField tfPesquisar;
    @FXML private JFXTextField tfInsEstadual;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //-----> Configuração da barra de título do form
        lblTitulo.setText("CADASTRO DE "+ toUpperCase(titulo));
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
